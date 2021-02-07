package io.transaction.mongo

import com.mongodb.client.ClientSession
import com.mongodb.client.MongoClient
import io.transaction.interfaces.Transaction
import io.transaction.interfaces.TransactionAbortedException
import io.transaction.interfaces.TransactionException
import mu.KotlinLogging

class TransactionMongo private constructor(private val client: MongoClient) : Transaction {
    private val logger = KotlinLogging.logger {}
    private lateinit var session: ClientSession

    override fun start() {
        session = client.startSession()
        session.startTransaction()
    }

    override fun commit() {
        if (!session.hasActiveTransaction()) {
            throw TransactionException("No active transaction")
        }
        try {
            session.commitTransaction()
        } catch (e: Exception) {
            session.abortTransaction()
            logger.error("Failed to commit transaction", e)
            throw TransactionAbortedException(e);
        } finally {
            session.close()
        }
    }

    override fun abort() {
        session.abortTransaction()
        session.close()
    }

    fun session() = session

    companion object Factory {
        fun create(client: MongoClient) = TransactionMongo(client)
    }

}