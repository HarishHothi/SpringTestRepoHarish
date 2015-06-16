/**
 * 
 */
package com.harish.spring.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.spring.myApp.entity.Blog;

/**
 * @author Harish.A
 *
 */
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
