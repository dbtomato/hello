package com.xws.entity;

/**  
 * @Title: Wizard.java
 * @Package com.xws.controller
 * @Description: TODO
 * @author XWS
 * @date 2016-4-24
 */
public class Wizard {

	private String id;
	private String name;
	private String password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Wizard [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
	
}
