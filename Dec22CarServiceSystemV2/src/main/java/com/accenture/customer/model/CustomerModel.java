package com.accenture.customer.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerModel {
	public CustomerModel(String name, String username, String password, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	private String name;
	private String username;
	private String password;
	private String email;

	public CustomerModel() {
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Perform insertion
	public int addInfo() {
		try {
			// 1) Load Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			// 2) Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_db", "root", "rootroot");
			System.out.println("Connection Established Successfuly");

			// Check for unique username
			String s1 = "select * from customer where username=?";
			PreparedStatement pstmt1 = con.prepareStatement(s1);
			pstmt1.setString(1, username);
			ResultSet res = pstmt1.executeQuery();

			if (res.next()) {
				return -1; // Duplicated username
			} else {

				// 3) Insert data
				String s = "insert into customer values(?,?,?,?)";

				PreparedStatement pstmt = con.prepareStatement(s);

				pstmt.setString(1, name);
				pstmt.setString(2, username);
				pstmt.setString(3, password);
				pstmt.setString(4, email);

				int rows = pstmt.executeUpdate();
				return rows;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	public ArrayList<CustomerDetail> viewCustomers() {
		try {
			// 1) Load Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			// 2) Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_db", "root", "rootroot");
			System.out.println("Connection Established Successfully");

			String s = "select * from customer";
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(s);

			ArrayList<CustomerDetail> al = new ArrayList<CustomerDetail>();
			while (res.next()) {
				name = res.getString(1);
				username = res.getString(2);
				email = res.getString(4);

				// Creating object of CustomerDetails, so to store it in ArrayList
//				CustomerDetail tempCustomer = new CustomerDetail(name, username, email);
				al.add(new CustomerDetail(name, username, email));
			}
			return al;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
