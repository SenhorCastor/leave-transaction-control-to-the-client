package io.usecases.transaction

interface Transaction {
    fun start()
    fun commit()
    fun abort()
}