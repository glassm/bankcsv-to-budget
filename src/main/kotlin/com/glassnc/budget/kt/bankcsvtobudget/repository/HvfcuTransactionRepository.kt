package com.glassnc.budget.kt.bankcsvtobudget.repository

import com.glassnc.budget.kt.bankcsvtobudget.entity.HvfcuTransactionEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface HvfcuTransactionRepository: CrudRepository<HvfcuTransactionEntity, Long> {
//    fun getAllTransactionsForMonthAndYear(year: Int, month: Int) : MutableList<HvfcuTransactionEntity>
//    fun getCreditTransactionsForMonthAndYear(year: Int, month: Int) : MutableList<HvfcuTransactionEntity>
//    fun getDebitTransactionsForMonthAndYear(year: Int, month: Int) : MutableList<HvfcuTransactionEntity>
}
