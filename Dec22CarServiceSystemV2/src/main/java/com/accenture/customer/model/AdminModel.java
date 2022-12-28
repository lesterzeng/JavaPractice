package com.accenture.customer.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminModel {
	public AdminModel(String adminUsername, String adminPassword) {
		super();
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
	}
	private String adminUsername;
	private String adminPassword;
	public String getName() {
		return adminUsername;
	}
	public void setName(String name) {
		this.adminUsername = name;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	public int adminLogin() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			// 2) Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin_db", "root", "rootroot");
			System.out.println("Connection Established Successfully");
			
			String s = "select * from admin where admin_user =?";
			PreparedStatement pstmt = con.prepareStatement(s);
			
			pstmt.setString(1, adminUsername);
			ResultSet res = pstmt.executeQuery();
			
			if(res.next()) {
				if(res.getString(2).equals(adminPassword)){
					return 1; //valid
				} else {
					return 0; //invalid password
				}
			} else {
				return -1; //invalid username
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
