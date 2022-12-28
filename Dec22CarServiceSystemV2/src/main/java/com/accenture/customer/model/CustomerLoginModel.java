package com.accenture.customer.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class CustomerLoginModel {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerLoginModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int customerLogin() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			// 2) Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_db", "root", "rootroot");
			System.out.println("Connection Established Successfully");

			String s = "select * from customer where username=?";
			PreparedStatement pstmt = con.prepareStatement(s);

			pstmt.setString(1, username);
			ResultSet res = pstmt.executeQuery();

			if (res.next()) { // if user exist
				if (res.getString(3).equals(password)) {
					return 1; // valid password
				} else {
					return 0; // invalid password
				}
			} else {
				return -1; // invalid username
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}
}
