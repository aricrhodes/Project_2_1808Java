package com.revature.driver;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.revature.pojo.User;
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

		/*User ex = new User(1,"TrueAdmin", "blah01", true);
		us.newUser(ex);*/
		
		/*User me=sess.get(User.class, 2);
		me.setAdmin(true);
		us.updateUser(me);*/
		us.deleteUser("TrueAdmin");
        System.out.println(us.getAllUsers());		//shows a list of all users in the database


	}

}
