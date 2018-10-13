package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List<User> getUsers() {
		System.out.println("inside get users");
		
		return us.getAllUsers();
		
		
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST, consumes= {"application/json"})
	public void addUser(@RequestBody 
			User u) {
		System.out.println("inside addUser()");
		
		us.newUser(u);
	}
	
	@RequestMapping(value="/user/*", method=RequestMethod.PUT)
	public void updateUser(User u) {
		System.out.println("inside updateUser");
		us.updateUser(u);
	}
	
	@RequestMapping(value="/user/*", method=RequestMethod.DELETE)
	public void deleteUser(String username) {
		System.out.println("inside deleteUser()");
		us.deleteUser(username);
	}
	
}
