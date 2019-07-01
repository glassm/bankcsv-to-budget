package com.glassnc.budget.kt.bankcsvtobudget.service

import com.glassnc.budget.kt.bankcsvtobudget.entity.HvfcuTransactionEntity

interface TransactionService {
//    fun addTransaction(transaction: HvfcuTransactionEntity): HvfcuTransactionEntity
//    fun deleteTransaction(transaction: HvfcuTransactionEntity)
//    fun deleteAllTransactions()
//    fun getTransactionById(id: Long): HvfcuTransactionEntity?
    fun getTransactions(): MutableIterable<HvfcuTransactionEntity>?
//    fun updateTransaction(id: Long, transaction: HvfcuTransactionEntity): HvfcuTransactionEntity
//
    fun getAllTransactionsForMonthAndYear(month: Int, year: Int) : MutableList<HvfcuTransactionEntity>
    fun getCreditTransactionsForMonthAndYear(month: Int, year: Int) : MutableList<HvfcuTransactionEntity>
    fun getDebitTransactionsForMonthAndYear(month: Int, year: Int) : MutableList<HvfcuTransactionEntity>
}
