package com.revature.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDAO;
import com.revature.pojo.User;
import com.revature.util.SessionUtil;

@Service
@Transactional
public class UserService {
	
	UserDAO udao = new UserDAO();
	
	Session sess = SessionUtil.getSession();
	public User getUserById(int id)
	{
		return udao.getUserById(id);
	}
	public void newUser(User u) {
		udao.newUser(u);
	}
	public User getUser(String username) {
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
