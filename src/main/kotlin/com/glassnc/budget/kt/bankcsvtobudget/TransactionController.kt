package com.glassnc.budget.kt.bankcsvtobudget

import com.glassnc.budget.kt.bankcsvtobudget.service.TransactionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class TransactionController {

    @Autowired
    lateinit var txnService: TransactionService

    @GetMapping("/transactions")
    fun getAllTransactions() =
            txnService.getTransactions()

    @GetMapping("/transactions/credit/{month}/{year}")
    fun getCreditTransactions(@PathVariable("month") month: Int, @PathVariable("year") year: Int ) =
            txnService.getCreditTransactionsForMonthAndYear(month, year)

    @GetMapping("/transactions/debit/{month}/{year}")
    fun getDebitTransactions(@PathVariable("month") month: Int, @PathVariable("year") year: Int ) =
            txnService.getDebitTransactionsForMonthAndYear(month, year)

    @GetMapping("/transactions/all/{month}/{year}")
    fun getAllTransactions(@PathVariable("month") month: Int, @PathVariable("year") year: Int ) =
            txnService.getAllTransactionsForMonthAndYear(month, year)


//    @GetMapping(value = "/{id}")
//    fun getTransactionById(@PathVariable("id") id: Long) = txnService.getTransactionById(id)

//    @GetMapping(value = "/users/{firstname}")
//    fun getUserByFirstname(@PathVariable("firstname") firstname: String) =
//            userService.getUserByFirstName(firstname)

//    @PostMapping("/users")
//    fun createUser(@Valid @RequestBody user: SecurityProperties.User) =
//            userService.addUser(user)

//    @DeleteMapping("/users/{id}")
//    fun deleteUserById(@PathVariable id: Long) =
//            userService.deleteUser(id)
//
//    @DeleteMapping("/users")
//    fun deleteUsers() =
//            userService.deleteAllUsers()
//
//    @PutMapping("/users/{id}")
//    fun updateUser(@PathVariable ("id")id:Long, @RequestBody user: User)=
//            userService.updateUser(id,user)




}
