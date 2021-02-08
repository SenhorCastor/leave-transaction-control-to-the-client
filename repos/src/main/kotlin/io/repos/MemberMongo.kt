package io.repos

import io.entities.Member
import java.util.*

data class MemberMongo(
    val id: UUID,
    val username: String,
    val storiesWrittenCount: Int
) {
    companion object {
        fun toPersistence(member: Member): MemberMongo {
            return MemberMongo(member.id, member.username, member.storiesWrittenCount)
        }

    }
}