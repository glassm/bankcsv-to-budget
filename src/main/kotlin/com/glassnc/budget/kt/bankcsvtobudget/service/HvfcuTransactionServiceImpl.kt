package com.glassnc.budget.kt.bankcsvtobudget.service

import com.glassnc.budget.kt.bankcsvtobudget.entity.HvfcuTransactionEntity
import com.glassnc.budget.kt.bankcsvtobudget.repository.HvfcuTransactionRepository
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HvfcuTransactionServiceImpl: TransactionService {

    @Autowired
    lateinit var repository: HvfcuTransactionRepository

    private val log = KotlinLogging.logger {}

//    override fun addTransaction(transaction: HvfcuTransactionEntity): HvfcuTransactionEntity {
//        repository.save(transaction)
//        log.info("$ added!!!")
//        return transaction
//    }

//    override fun deleteTransaction(transaction: HvfcuTransactionEntity) {
//        val count = repository.delete(transaction)
//        log.info("Found $ $count times and deleted!")
//    }
//
//    override fun deleteAllTransactions() {
//        val count = repository.deleteAll()
//        log.info("Deleted $count transactions!")
//    }
//
//    override fun getTransactionById(id: Long): HvfcuTransactionEntity? {
//        val transaction = repository.findById(id).get()
//        log.info("Retrieved $transaction")
//        return transaction
//    }

    override fun getTransactions(): MutableIterable<HvfcuTransactionEntity> {
        val transactions = repository.findAll()
        log.info("Retrieved ${transactions.count()} transactions")
        return transactions
    }

    override fun getAllTransactionsForMonthAndYear(month: Int, year: Int) : MutableList<HvfcuTransactionEntity> {
        val newList : List<HvfcuTransactionEntity> = this.getTransactions().filter {
            it.date.matches("$month/\\d{2}/$year".toRegex())
        }
        return newList.toMutableList()
    }

    override fun getCreditTransactionsForMonthAndYear(month: Int, year: Int) : MutableList<HvfcuTransactionEntity> {
        val newList : List<HvfcuTransactionEntity> = this.getTransactions().filter {
            it.date.matches("$month/\\d{2}/$year".toRegex()) && it.type.toUpperCase().equals("CREDIT")
        }
        return newList.toMutableList()
    }

    override fun getDebitTransactionsForMonthAndYear(month: Int, year: Int) : MutableList<HvfcuTransactionEntity> {
        val newList : List<HvfcuTransactionEntity> = this.getTransactions().filter {
            it.date.matches("$month/\\d{2}/$year".toRegex()) && it.type.toUpperCase().equals("DEBIT")
        }
        return newList.toMutableList()
    }

//    override fun updateTransaction(id: Long, transaction: HvfcuTransactionEntity): HvfcuTransactionEntity {
//        val trx: HvfcuTransactionEntity = repository.findById(id).get()
//        trx.let {
//            val updatedTxn = repository.save(transaction)
//            log.info("${updatedTxn.Id},updated!!!")
//        }
//        return trx
//    }
//
//    override fun getAllTransactionsForMonthAndYear(year: Int, month: Int): MutableList<HvfcuTransactionEntity> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun getCreditTransactionsForMonthAndYear(year: Int, month: Int): MutableList<HvfcuTransactionEntity> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun getDebitTransactionsForMonthAndYear(year: Int, month: Int): MutableList<HvfcuTransactionEntity> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

}
