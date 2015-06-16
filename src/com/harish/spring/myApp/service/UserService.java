/**
 * 
 */
package com.harish.spring.myApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.spring.myApp.entity.User;
import com.harish.spring.myApp.repository.UserRepository;

/**
 * @author Harish.A
 *
 */

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAll(){
		return userRepo.findAll();
	}

	public User findOne(int id) {
		return userRepo.findOne(id);
	}
}
