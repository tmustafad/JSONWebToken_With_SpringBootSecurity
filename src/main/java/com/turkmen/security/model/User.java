/**
 * 
 */
package com.turkmen.security.model;

/**
 * @author TTTDEMIRCI
 *
 */
public class User {
	private String userName;
	private long id;
	private String role;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}
}
