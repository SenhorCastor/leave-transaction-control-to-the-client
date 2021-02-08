package io.usecases.repos

import io.entities.Story
import io.entities.transaction.Transaction

interface StoryRepo {
    fun save(story: Story, transaction: Transaction? = null): Transaction

}