package io.usecases.repos

import io.entities.Story
import io.usecases.transaction.Transaction

interface StoryRepo {
    fun save(story: Story, transaction: Transaction? = null): Transaction

}