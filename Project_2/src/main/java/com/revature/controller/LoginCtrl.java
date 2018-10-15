package com.revature.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.pojo.User;
import com.revature.service.AuthService;

@Controller
@CrossOrigin(origins="http://localhost:4200")
public class LoginCtrl {
	
	@Autowired
	private AuthService authService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet(HttpSession sess){
		System.out.println("inside login");
		if (sess.getAttribute("user") != null){
			return "home";
		}
		return "login";
	}
	
	//Testing alternative method
  @RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginPost(@RequestBody User user, BindingResult bindingResult, ModelMap modelMap, HttpSession sess){
	  		
		User authUser = authService.validate(user);
		
		if (bindingResult.hasErrors()){
			modelMap.addAttribute("errorMessage", bindingResult.getAllErrors().get(0).getDefaultMessage());
			return "login";
		}
		
		if(authUser != null){
			sess.setAttribute("user", authUser);
			return "home";
		}
		
		modelMap.addAttribute("errorMessage", "Username or password incorrect");
		
		return "login";
	}
	
/*	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginPost( String username, String password){
		
		System.out.println("Inside Login Control Post");
		
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);
		
		User authUser = authService.validate(user);
		
		System.out.println("after AuthUser");
		
		if(authUser != null){ 
			return "home";
		}
		
		return "login";
	}
*/

}
