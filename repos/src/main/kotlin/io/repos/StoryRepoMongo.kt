package io.repos

import com.mongodb.client.MongoClient
import io.entities.Story
import io.usecases.repos.StoryRepo
import io.entities.transaction.Transaction
import io.transaction.mongo.getTransaction
import org.litote.kmongo.save

class StoryRepoMongo(private val mongoClient: MongoClient): StoryRepo {
    private val collection = mongoClient.getDatabase("app").getCollection("story", StoryMongo::class.java)

    override fun save(story: Story, transaction: Transaction?): Transaction {
        val transactionUsed = mongoClient.getTransaction(transaction)
        val storyMongo = StoryMongo.toPersistence(story)
        collection.save(storyMongo)
        return transactionUsed
    }
}