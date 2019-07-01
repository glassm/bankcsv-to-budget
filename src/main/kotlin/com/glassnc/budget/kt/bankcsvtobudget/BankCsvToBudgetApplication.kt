

package com.glassnc.budget.kt.bankcsvtobudget

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class BankCsvToBudgetApplication

fun main(args: Array<String>) {
    SpringApplication.run(BankCsvToBudgetApplication::class.java, *args)
}
