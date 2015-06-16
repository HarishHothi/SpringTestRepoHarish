/**
 * 
 */
package com.harish.spring.myApp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.spring.myApp.entity.Blog;
import com.harish.spring.myApp.entity.Item;
import com.harish.spring.myApp.entity.Role;
import com.harish.spring.myApp.entity.User;
import com.harish.spring.myApp.repository.BlogRepository;
import com.harish.spring.myApp.repository.ItemRepository;
import com.harish.spring.myApp.repository.RoleRepository;
import com.harish.spring.myApp.repository.UserRepository;

/**
 * @author Harish.A
 *
 */
@Transactional // this is of javax.persistance
@Service // this is from spring check it is fine or not
public class IniitDBService {

	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Autowired
	private BlogRepository blogRepo;
	
	@PostConstruct
	public void initDB(){
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepo.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepo.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		userAdmin.setEmail("admin.a@altiux.com");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepo.save(userAdmin);
		
		User userHarish = new User();
		userHarish.setName("Harish");
		userHarish.setEmail("Harish.a@altiux.com");
		roles.clear(); //  clear admin role and add role for harish user
		roles.add(roleAdmin);
		roles.add(roleUser);
		userHarish.setRoles(roles);
		userRepo.save(userHarish);
		
		Blog blog = new Blog();
		blog.setName("W3WebSite");
		blog.setUrl("http://www.w3.org");
		blog.setUser(userHarish);
		
			
		Item item1 = new Item();
		item1.setTitle("FIRST ITME IN BLOG");
		item1.setDescription("HTTP STATUS CODE");
		item1.setLink("http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html");
		item1.setPublishedDate(new Date());
		item1.setBlog(blog);
		
		Item item2 = new Item();
		item2.setTitle("SECOND ITME IN BLOG");
		item2.setDescription("w3 standards webofservices");
		item2.setLink("http://www.w3.org/standards/webofservices/");
		item2.setPublishedDate(new Date());
		item2.setBlog(blog);
		
		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		
		blog.setItems(items);
		
		blogRepo.save(blog);
		itemRepo.save(item1);
		itemRepo.save(item2);
	}	
}
