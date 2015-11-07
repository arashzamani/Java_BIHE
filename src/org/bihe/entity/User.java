package org.bihe.entity;
/**
 * 
 * @author Arash Zamani Farahani
 * @version 1.0.0
 * 11.1.2015
 * this is a super class. The entity users can login from client side
 */

public class User {
	// instance fields
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	// ----------------------------------------------------------------
	// Constructors
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	// ----------------------------------------------------------------
	public User(String username, String password, String firstname,
			String lastname) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	// ----------------------------------------------------------------
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String toString(){
		return this.firstname + " "+this.lastname;
	}
}
