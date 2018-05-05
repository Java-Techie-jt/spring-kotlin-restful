package com.javatechie.spring.kotlin.restful.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringKotlinRestfulApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinRestfulApplication::class.java, *args)
}
