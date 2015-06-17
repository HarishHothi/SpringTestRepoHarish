/**
 * 
 */
package com.harish.spring.myApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.harish.spring.myApp.entity.User;
import com.harish.spring.myApp.service.UserService;
/**
 * @author Harish.A
 *
 */

@Controller
public class UserContoller {

	@Autowired
	private UserService userService;
	
	
	@ModelAttribute("user") // this user must match with the form commandName attribute
	public User constructUser(){
		return new User();
	}
	
	@RequestMapping("/users")
	public String getAllusers(Model model){
		System.out.println("getting users list in controller");
		model.addAttribute("users", userService.findAll());
		return "users";		
	}
	
	@RequestMapping("/user/{id}")
	public String getUserInfo(Model model,@PathVariable int id){
		model.addAttribute("userInfo",userService.findoneWithBlogs(id)); // this userInfo will be available as object in user-detail.jsp file 
		return "user-detail"; // this is the definition name in general.xml		
	}
	
	@RequestMapping("/register")
	public String RegisterUser(){
		return "user-register"; // name in general.xml
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String doRegister(@ModelAttribute("user")User user){
		userService.save(user);
		return "user-register";
	}
	public void TestGit(){
		
	}
}
