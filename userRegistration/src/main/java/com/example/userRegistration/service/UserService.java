package com.example.userRegistration.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.userRegistration.model.User;

@Service
public class UserService {

	HashMap<String, User> map = new HashMap<String, User>();

	public UserService() {
		User user = new User();
		user.setId("1");
		user.setFirstName("Steve");
		user.setLastName("Smith");
		user.setAge("35");
		map.put("1", user);

		user = new User();
		user.setId("2");
		user.setFirstName("Tom");
		user.setLastName("Curren");
		user.setAge("28");
		map.put("2", user);
	}

	public HashMap<String, User> getAll() {
		return map;
	}

	public User getId(String id) {
		if (map.containsKey(id))
			return map.get(id);
		else
			return null;
	}
}
