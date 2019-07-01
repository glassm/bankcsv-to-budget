package com.glassnc.budget.kt.bankcsvtobudget.spreadsheet

import com.glassnc.budget.kt.bankcsvtobudget.entity.HvfcuTransactionEntity
import com.opencsv.bean.CsvBindByName
import java.text.SimpleDateFormat

class HvfcuTransactionDTO {

    @CsvBindByName(column = "Date", required = true)
    var date = ""

    @CsvBindByName(column = "Description", required = true)
    var description = ""

    @CsvBindByName(column = "Original Description", required = true)
    var originalDescription = ""

    @CsvBindByName(column = "Amount", required = true)
    var amount = 0.0

    @CsvBindByName(column = "Type", required = true)
    var type = ""

    @CsvBindByName(column = "Parent Category", required = true)
    var parentCategory = ""

    @CsvBindByName(column = "Category", required = true)
    var category = ""

    @CsvBindByName(column = "Account", required = true)
    var account = ""

    @CsvBindByName(column = "Tags", required = false)
    var tags = ""

    @CsvBindByName(column = "Memo", required = false)
    var memo = ""

    @CsvBindByName(column = "Pending", required = true)
    var pending = false

    fun transaction(): HvfcuTransactionEntity {
        val hvfcuTransactionEntity = HvfcuTransactionEntity(
                account = this.account,
                amount = this.amount,
                category = this.category,
                date = this.date,
                description = this.description,
                memo = this.memo,
                originalDescription = this.originalDescription,
                parentCategory = this.parentCategory,
                pending = this.pending,
                tags = this.tags,
                type = this.type
        )
        return hvfcuTransactionEntity
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HvfcuTransactionDTO

        if (date != other.date) return false
        if (description != other.description) return false
        if (originalDescription != other.originalDescription) return false
        if (amount != other.amount) return false
        if (type != other.type) return false
        if (parentCategory != other.parentCategory) return false
        if (category != other.category) return false
        if (account != other.account) return false
        if (memo != other.memo) return false
        if (pending != other.pending) return false

        return true
    }

    override fun hashCode(): Int {
        var result = date.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + originalDescription.hashCode()
        result = 31 * result + amount.hashCode()
        result = 31 * result + type.hashCode()
        result = 31 * result + parentCategory.hashCode()
        result = 31 * result + category.hashCode()
        result = 31 * result + account.hashCode()
        result = 31 * result + memo.hashCode()
        result = 31 * result + pending.hashCode()
        return result
    }

    override fun toString(): String {
        return "HvfcuTransactionDTO(date='$date', description='$description', originalDescription='$originalDescription', amount=$amount, type='$type', parentCategory='$parentCategory', category='$category', account='$account', tags='$tags', memo='$memo', pending=$pending)"
    }


}
