package io.transaction.mongo

import com.mongodb.client.MongoClient
import io.entities.transaction.Transaction

fun MongoClient.getTransaction(transaction: Transaction?): TransactionMongo {
    return if (transaction == null) {
        val newTransaction = TransactionMongo.create(this)
        newTransaction.start()
        return newTransaction
    } else {
        transaction as TransactionMongo
    }
}
