package com.revature.driver;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.revature.pojo.User;
import com.revature.service.UserService;
import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {

		Session sess = SessionUtil.getSession();
		
		UserService us = new UserService();
		
		//System.out.println(us.getAllUsers());
/*		String hql = "FROM USER_TABLE";
        
        Query query = sess.createQuery(hql);
        
        List<User> u = ((org.hibernate.query.Query) query).list();*/
        
        System.out.println(sess.get(User.class, 2));
        System.out.println(us.getUser("Aric"));


	}

}
