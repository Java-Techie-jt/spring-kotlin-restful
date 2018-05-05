package com.javatechie.spring.kotlin.restful.api.controller

import com.javatechie.spring.kotlin.restful.api.dto.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

	@GetMapping("/getUser")
	fun getUser() = User(123, "Basant", 20.000)


	@GetMapping("/getUsers")
	fun getUsers(): List<User> {
		val users = listOf(User(123, "Basant", 20.000), User(777, "Santosh", 40.000))
		return users;
	}

}