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
	 * DataBase (Works)
	 * -------------------------------------*/
	public void newUser(User u) {
		User save =u;
		//sess.persist(u);
		sess.save(save);
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
	public User getUser(String username) {
		
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
	 * (works)
	 * -------------------------------------*/
	public void updateUser(User user) {
		User u = user;		
		sess.saveOrUpdate(u);
	}
	/*---------------------------------------
	 * Delete a user in the database using the 
	 * username (not sure)
	 * -------------------------------------*/
	public void deleteUser(String username) {
		User input = getUser(username);
		/*System.out.println(input.getId());
		sess.remove(input);*/
		
		/*Query q = sess.createQuery("delete User where id = '"+sess.load(User.class, input.getId())+"' CASCADE");
		q.executeUpdate();*/

		User ent = sess.load(User.class, input.getId());
		System.out.println(ent);
		sess.delete(sess.load(User.class, input.getId()));
	}

}
