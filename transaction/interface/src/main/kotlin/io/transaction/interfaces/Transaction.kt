package io.transaction.interfaces

interface Transaction {
    fun start()
    fun commit()
    fun abort()
}