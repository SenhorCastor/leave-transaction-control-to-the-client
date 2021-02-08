package io.repos

import com.mongodb.client.MongoClient
import io.usecases.repos.MemberRepo
import io.entities.transaction.Transaction
import io.entities.Member
import io.transaction.mongo.getTransaction
import org.litote.kmongo.save

class MemberRepoMongo(private val mongoClient: MongoClient): MemberRepo {
    private val collection = mongoClient.getDatabase("app").getCollection("member", MemberMongo::class.java)

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