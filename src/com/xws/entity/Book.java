package com.xws.entity;

/**  
 * @Title: Book.java
 * @Package com.xws.entity
 * @Description: TODO
 * @author XWS
 * @date 2016-4-23
 */
public class Book {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
	
}
