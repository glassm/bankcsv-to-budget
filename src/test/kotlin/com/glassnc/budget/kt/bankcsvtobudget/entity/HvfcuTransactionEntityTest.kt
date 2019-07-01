package com.glassnc.budget.kt.bankcsvtobudget.entity

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationTests(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `Assert blog page title, content and status code`() {
        val entity = restTemplate.getForEntity<String>("/transactions")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
//        assertThat(entity.body).contains("<h1>Blog</h1>")
    }

    @Test
    fun `Assert getCreditTransactions`() {
        val entity = restTemplate.getForEntity<String>("/transactions/credit/12/2018")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
//        assertThat(entity.body).contains("<h1>Blog</h1>")
    }

}
