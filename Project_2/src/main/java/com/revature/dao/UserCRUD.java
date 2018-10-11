package com.revature.dao;

import java.util.List;

import com.revature.pojo.User;

public interface UserCRUD {
	
	//Create
	public void newUser(String username, String password, Boolean role);
	
	//Read
	public User getUser(String username);
	public List<User> getAllUsers();
	
	//Update
	public void updateUser(User user);
	
	//Delete
	public void deleteUser(String username);

}
