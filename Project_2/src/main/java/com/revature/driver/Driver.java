package com.revature.driver;

import org.hibernate.Session;

import com.revature.dao.UserDAO;
import com.revature.pojo.User;
import com.revature.service.AuthService;
import com.revature.service.UserService;
import com.revature.util.SessionUtil;

public class Driver {

	/*-----------------------------------
	 * Driver class use to see if methods actually 
	 * work
	 * ----------------------------------*/
	public static void main(String[] args) {
        
		Session sess = SessionUtil.getSession();	//Open the session from the session factory
		
		UserService us = new UserService();			//Connection to the services that connect to the DAO
		AuthService as = new AuthService();
		UserDAO ud = new UserDAO();
		
		/*User ex = new User(1,"TrueAdmin", "blah01", true);
		us.newUser(ex);*/
		
		/*User me=sess.get(User.class, 2);
		me.setAdmin(true);
		us.updateUser(me);*/
		//us.deleteUser("TrueAdmin");
		User u = new User(1, "Aric", "yellow", true);
		
/*		System.out.println("User Service version: " + us.getUser(u.getUsername()).toString());
		System.out.println("User Service password " + us.getUser(u.getUsername()).getPassword());
		System.out.println("DAO version: " + ud.getUser(u.getUsername()).toString());
		System.out.println("DAO version: " + ud.getUser(u.getUsername()).getPassword());
        System.out.println("Auth Service version: " + as.validate(u));		*/


	}

}
