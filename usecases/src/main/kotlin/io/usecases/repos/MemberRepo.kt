package io.usecases.repos

import io.entities.Member
import io.entities.transaction.Transaction

interface MemberRepo {
    fun save(member: Member, transaction: Transaction? = null): Transaction
}