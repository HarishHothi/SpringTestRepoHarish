/**
 * 
 */
package com.harish.spring.myApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.spring.myApp.entity.Blog;
import com.harish.spring.myApp.entity.User;

/**
 * @author Harish.A
 *
 */
public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findBlogByUser(User user);

}
