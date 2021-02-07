package io.domain.entities

import java.util.*

data class Member(val id: UUID, val username: String, val storiesWrittenCount: Int) {
    fun incrementStoriesWrittenCount() = Member(this.id, this.username, this.storiesWrittenCount + 1)
}
