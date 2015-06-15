/**
 * 
 */
package com.harish.spring.myApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Harish.A
 *
 */
@Entity
public class User {

	@Id // indicate below is primary key for current entity
	@GeneratedValue
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
