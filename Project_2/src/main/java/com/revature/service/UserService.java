package com.revature.service;

import java.util.List;

import org.hibernate.Session;

import com.revature.dao.UserDAO;
import com.revature.pojo.User;
import com.revature.util.SessionUtil;

public class UserService {
	
	UserDAO udao = new UserDAO();
	
	Session sess = SessionUtil.getSession();
	
	public void newUser(String username, String password, Boolean role) {
		udao.newUser(username, password, role);
	}
	public User getUser(String username) {
		System.out.println("inside of Service " + username);
		return udao.getUser(username);
	}
	public List<User> getAllUsers() {
		return udao.getAllUsers();
	}

	public void updateUser(User user) {
		udao.updateUser(user);
	}

	public void deleteUser(String username) {
		udao.deleteUser(username);
		
	}


}
