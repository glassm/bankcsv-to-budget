package com.glassnc.budget.kt.bankcsvtobudget.entity

import com.glassnc.budget.kt.bankcsvtobudget.spreadsheet.HvfcuTransactionDTO
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "hvfcu_transactions")
data class HvfcuTransactionEntity(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var Id : Long = -1, //Primary Key
        var date : String = "01/01/1970",
        var description : String = "",
        var originalDescription: String = "",
        var amount: Double = 0.0,
        var type: String = "Debit",
        var parentCategory: String = "",
        var category: String = "",
        var account: String = "",
        var tags: String = "",
        var memo: String = "",
        var pending: Boolean = false
)
{
    override fun toString(): String {
        return "HvfcuTransactionDTO(Id=$Id, date=$date, description='$description', originalDescription='$originalDescription', amount=$amount, type='$type', parentCategory='$parentCategory', category='$category', account='$account', tags='$tags', memo='$memo', pending=$pending)"
    }

    fun dto(): HvfcuTransactionDTO {
        val dto = HvfcuTransactionDTO()
        dto.account = this.account
        dto.amount = this.amount
        dto.category = this.category
        dto.date = this.date
        dto.description = this.description
        dto.memo = this.memo
        dto.originalDescription = this.originalDescription
        dto.parentCategory = this.parentCategory
        dto.pending = this.pending
        dto.tags = this.tags
        dto.type = this.type
        return dto
    }


}
