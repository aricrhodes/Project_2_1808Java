package com.revature.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.pojo.User;

@Service
public class AuthService {
	
	Logger log = Logger.getLogger(AuthService.class);
	
	@Autowired
	UserService us;
	
	public User validate(User user){
	    
		
		User authUser = null;
		
		log.info("Username passed into validate: " + user.getUsername());
		log.info("Password passed into validate: " + user.getPassword());
		
		authUser=us.getUser(user.getUsername());
		if((authUser != null)&& authUser.getPassword()== user.getPassword()){
			authUser = user;
			authUser.setId(1);
		}else {
			authUser=null;
		}
		
		
		
		return authUser;
		
	}

}
