/**
 * 
 */
package com.harish.spring.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.spring.myApp.entity.User;

/**
 * @author Harish.A
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
