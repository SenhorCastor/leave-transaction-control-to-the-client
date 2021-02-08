package io.repos

import io.entities.Story
import java.util.*

data class StoryMongo(
    val id: UUID,
    val title: String,
) {
    companion object {
        fun toPersistence(story: Story): StoryMongo {
            return StoryMongo(story.id, story.title)
        }

    }
}