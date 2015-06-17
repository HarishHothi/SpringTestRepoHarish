/**
 * 
 */
package com.harish.spring.myApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.harish.spring.myApp.entity.Blog;
import com.harish.spring.myApp.entity.Item;
import com.harish.spring.myApp.entity.User;
import com.harish.spring.myApp.repository.BlogRepository;
import com.harish.spring.myApp.repository.ItemRepository;
import com.harish.spring.myApp.repository.UserRepository;

/**
 * @author Harish.A
 *
 */

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BlogRepository blogRepo;
	
	@Autowired
	private ItemRepository itemRepo;
	
	public List<User> findAll(){
		return userRepo.findAll();
	}

	public User findOne(int id) {
		return userRepo.findOne(id);
	}

	// all this database query is in one transaction so annotate this method as a transaction .
	// if you will not annotate then you will get hibernate lazyLinitilizationException
	
	@Transactional
	public Object findoneWithBlogs(int id) {
		User user = userRepo.findOne(id);
		List<Blog> blogs = blogRepo.findBlogByUser(user);
		for(Blog blog:blogs){
			List<Item> items = itemRepo.findItemsByBlog(blog,new PageRequest(0, 10, Direction.DESC, "publishedDate")); // start page number, page size, page order , order by published date
			blog.setItems(items);
		}
		user.setBlogs(blogs);
		return user;
	}

	public void save(User user) {
		userRepo.save(user);
		
	}
}
