package io.entities.transaction

interface Transaction {
    fun start()
    fun commit()
    fun abort()
}