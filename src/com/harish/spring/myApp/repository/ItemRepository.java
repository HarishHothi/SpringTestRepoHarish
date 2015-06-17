/**
 * 
 */
package com.harish.spring.myApp.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.spring.myApp.entity.Blog;
import com.harish.spring.myApp.entity.Item;

/**
 * @author Harish.A
 *
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {

	List<Item> findItemsByBlog(Blog blog,Pageable pageable);

}
