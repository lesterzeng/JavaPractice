package com.accenture.customer.model;

//Constructor to make it into an object
public class CustomerDetail {
	private String name;
	private String username;
	private String email;

	public CustomerDetail(String name, String username, String email) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
	}
	
	public String toString() {
		return "CustomerDetail [name =" + name + ", username =" + username + ", email =" + email + "]";
	}
}
