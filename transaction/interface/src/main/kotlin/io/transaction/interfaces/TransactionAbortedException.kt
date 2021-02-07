package io.transaction.interfaces

class TransactionAbortedException : Exception {
    constructor(message: String) : super(message)
    constructor(ex: Exception) : super(ex)
}
