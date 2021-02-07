package io.domain.repo

import com.mongodb.client.MongoClient
import io.domain.entities.Member
import io.domain.usecases.repos.MemberRepo
import io.transaction.interfaces.Transaction
import io.transaction.mongo.getTransaction
import org.litote.kmongo.save

class MemberRepoMongo(private val mongoClient: MongoClient): MemberRepo {
    private val collection = mongoClient.getDatabase("user").getCollection("users", MemberMongo::class.java)

    override fun save(
        member: Member,
        transaction: Transaction?
    ): Transaction {
        val transactionUsed = mongoClient.getTransaction(transaction)
        val memberMongo = MemberMongo.toPersistence(member)
        collection.save(memberMongo)
        return transactionUsed
    }
}