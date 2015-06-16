/**
 * 
 */
package com.harish.spring.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.spring.myApp.entity.Item;

/**
 * @author Harish.A
 *
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
