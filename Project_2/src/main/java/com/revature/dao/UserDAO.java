package com.revature.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.pojo.User;
import com.revature.util.SessionUtil;

public class UserDAO implements UserCRUD {
	
	Session sess = SessionUtil.getSession();

	public void newUser(String username, String password, Boolean role) {
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setAdmin(role);
		sess.saveOrUpdate(u);
	}

	@SuppressWarnings("deprecation")
	public User getUser(String username) {
		System.out.println("something random");
		Criteria filter = sess.createCriteria(User.class);
		User u = (User) filter.add(Restrictions.eq("USERNAME", username));
		return u;
	}


	public List<User> getAllUsers() {
		@SuppressWarnings("unchecked")
		String hql="from USER_TABLE";
		Query query=sess.createQuery(hql);
		List<User> users = (List<User>) sess.createQuery(hql).list();
		return users;
	}

	public void updateUser(User user) {
		User u = new User();
		u.setId(user.getId());
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		u.setAdmin(user.isAdmin());
		sess.saveOrUpdate(u);
	}

	public void deleteUser(String username) {
		User input = getUser(username);
		int id = input.getId();
		User result = (User) sess.createCriteria(User.class)
				.add(Restrictions.idEq(id));
		
		if (result != null) {
			sess.delete(result);
		}

	}

}
