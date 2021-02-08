package io.entities.transaction

class TransactionAbortedException : Exception {
    constructor(message: String) : super(message)
    constructor(ex: Exception) : super(ex)
}
