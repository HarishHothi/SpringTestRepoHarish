/**
 * 
 */
package com.harish.spring.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.spring.myApp.entity.Role;

/**
 * @author Harish.A
 *
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
