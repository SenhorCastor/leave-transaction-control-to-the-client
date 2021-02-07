package io.domain.usecases.repos

import io.domain.entities.Member
import io.transaction.interfaces.Transaction

interface MemberRepo {
    fun save(member: Member, transaction: Transaction? = null): Transaction
}