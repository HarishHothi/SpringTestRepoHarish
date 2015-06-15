/**
 * 
 */
package com.harish.spring.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Harish.A
 * controller must be annoted with @Controller annotation
 * it must have one method with annotation @RequestMapping 
 */

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String getIndexPage(){
		System.out.println("Here comes request");
		return "index";
	}
}
