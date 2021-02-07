package io.transaction.interfaces

class TransactionException : Exception {
    constructor(message: String) : super(message)
    constructor(ex: Exception) : super(ex)
}
