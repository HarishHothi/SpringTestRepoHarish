/**
 * 
 */
package com.harish.spring.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Harish.A
 *
 */
@Controller
public class LoginController {
	@RequestMapping("/login")
	public String getLogin(){
		System.out.println("in login control");
		return "login";
	}
}
