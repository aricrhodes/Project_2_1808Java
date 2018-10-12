package com.revature.dao;

import java.util.List;

import com.revature.pojo.User;

public interface UserCRUD {
	
	//Create
	public void newUser(User u);
	
	//Read
	public User getUser(String username);
	//ReadAll
	public List<User> getAllUsers();
	
	//Update
	public void updateUser(User user);
	
	//Delete
	public void deleteUser(String username);
	
	

}
