package io.domain.usecases.repos

import io.domain.entities.Story
import io.transaction.interfaces.Transaction

interface StoryRepo {
    fun save(story: Story, transaction: Transaction? = null): Transaction

}