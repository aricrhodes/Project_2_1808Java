package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService us;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getUsers() {
		System.out.println("inside get users");
		return us.getAllUsers();
	}

	@RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
	public User getUser(@PathVariable("username") String username) {
		System.out.println("inside get user");
		return us.getUser(username);
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = { "application/json" })
	public void addUser(@RequestBody User u) {
		System.out.println("inside addUser()");

		us.newUser(u);
	}

	@RequestMapping(value = "/user/{username}", method = RequestMethod.PUT)
	public void updateUser(@PathVariable("username") String username, @RequestBody User u) {
		u.setUsername(username);
		System.out.println("inside updateUser");
		us.updateUser(u);
	}

	@RequestMapping(value = "/user/{username}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("username") String username) {
		System.out.println("inside deleteUser");
		us.deleteUser(username);
	}

}
