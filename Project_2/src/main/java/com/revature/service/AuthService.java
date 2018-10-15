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
	
	UserService userS = new UserService();
	
	public User validate(User user){
	    
		
		User authUser;
		String userName = user.getUsername();
		
		log.info("Username passed into validate: " + user.getUsername());
		log.info("Password passed into validate: " + user.getPassword());
		
		authUser=userS.getUser(userName);
		if(authUser != null ){ 
			if(authUser.getPassword().equals(user.getPassword())){
				return authUser;
			}
		}
	
		return null;
		
	}

}
