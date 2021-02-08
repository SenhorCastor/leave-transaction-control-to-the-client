package io.usecases.repos

import io.entities.Member
import io.usecases.transaction.Transaction

interface MemberRepo {
    fun save(member: Member, transaction: Transaction? = null): Transaction
}