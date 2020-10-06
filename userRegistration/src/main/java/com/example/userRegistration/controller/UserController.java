package com.example.userRegistration.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userRegistration.model.User;
import com.example.userRegistration.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/all")
	public HashMap<String, User> getAll() {
		return userService.getAll();
	}

	@GetMapping("/{id}")
	public User getId(@PathVariable("id") String id) {
		return userService.getId(id);
	}

}
