package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.pojo.User;
import com.revature.util.SessionUtil;


public class UserDAO implements UserCRUD {
	
	Session sess = SessionUtil.getSession();

	/*---------------------------------------
	 * Method to make add new user in the 
	 * DataBase (not sure)
	 * -------------------------------------*/
	public void newUser(String username, String password, Boolean role) {
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setAdmin(role);
		sess.saveOrUpdate(u);
	}
	/*---------------------------------------
	 * Method to get a user object from the database 
	 * using the Id (Works)
	 * -------------------------------------*/
	public User getUserById(int id){
		
		return sess.get(User.class, id);
	}
	/*---------------------------------------
	 * Method to get object from the Database
	 * using the username (Works)
	 * -------------------------------------*/
	@SuppressWarnings("deprecation")
	public User getUser(String username) {
		
		//Criteria filter = sess.createCriteria(User.class);
		String hql = "FROM User AS U WHERE U.username = :name";
		Query query = sess.createQuery(hql);
		query.setParameter("name", username);
		
		List<User> user = (List<User>) query.list();
		
		return user.get(0);
	}
	/*---------------------------------------
	 * Method to get all the users in the DatabaseBase
	 * (Works)
	 * -------------------------------------*/
	public List<User> getAllUsers() {
		
		List<User> users = (List<User>) sess.createQuery("from User").list();

		return users;
	}
	/*---------------------------------------
	 * Method to add in a user to the Database
	 * (not sure)
	 * -------------------------------------*/
	public void updateUser(User user) {
		User u = new User();
		u.setId(user.getId());
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		u.setAdmin(user.isAdmin());
		
		sess.saveOrUpdate(u);
	}
	/*---------------------------------------
	 * Delete a user in the database using the 
	 * username (not sure)
	 * -------------------------------------*/
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
