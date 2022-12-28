package com.accenture.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;




// Login / Register 

public class LaunchUser {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - New Customer/register");
		System.out.println("2 - Exisiting Customer/login");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:register();
		break;
		case 2:login();
		break;
		default:System.out.println("Invalid Selection");
		break;
		}
		
		
	}
	
	static void register() throws Exception {
		
		
		String name = null;
		String userName = null;
		String password = null;
		int phoneNumber = 0;
		String email = null;
		
		
		
		// 1) Load Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		
		// 2) Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "rootroot");  
		System.out.println("Connection Established Successfully");
		
		
		
		/////// Name
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");		
		name = scan.next();
		
		
		/////// userName
		while(true){
		System.out.println("Enter your username");		
		userName = scan.next();
		
		String s1 = "select * from user where username = ?";  // look this up
		PreparedStatement pstmt1 = con.prepareStatement(s1);
		pstmt1.setString(1,userName);
		ResultSet res = pstmt1.executeQuery();
		
		if(res.next()) {
			System.out.println("Username exists. Please select another username"); // Username validation
		} else {
			break;
		}
		
		}
		
		
		/////// Password
		while(true) {
		System.out.println("Enter your password");		
		password = scan.next();
		
		if(password.length()<8) {
			System.out.println("Please have minimum of 8 characters");			// Password validation
		} else {
			break;
			}
		}
		System.out.println("Enter your phone number");		
		phoneNumber = scan.nextInt();
		
		
		
		
		/////// Phone Number
		while(true) {
			System.out.println("Enter your phone number");
			phoneNumber = scan.nextInt();
			String newPhoneNumber = String.valueOf(phoneNumber);
			
			if(newPhoneNumber.length()!=8) {
				System.out.println("Enter a valid phone number");
			}
			else {
				break;
			}
		}
		
		System.out.println("Enter your email");		
		email = scan.next();
			

		
	
		
				
				
		
		
						String s2 = "insert into user values(?, ?, ?, ?, ?)";
						
						PreparedStatement pstmt = con.prepareStatement(s2);
						pstmt.setString(1, name);
						pstmt.setString(2, userName);
						pstmt.setString(3, password);
						pstmt.setInt(4, phoneNumber);
						pstmt.setString(5, email);
						
						
						int rows = pstmt.executeUpdate();
						
						if(rows>0) {
							System.out.println("Successfully registered");
						} else {
							System.out.println("Registration failed");
						}
					}
					
	
		
				
			
				
				

		
		
		

	
	static void login() throws Exception{
		
		// 1) Load Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		
		// 2) Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "rootroot");  
		System.out.println("Connection Established Successfully");
		
		String userName = null;
		String password = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome back");
		System.out.println("Enter your username");
		userName = scan.next();
		System.out.println("Enter your password");
		password = scan.next();
		
		String s = "select * from user where username = ?";
		PreparedStatement pstmt = con.prepareStatement(s);
		pstmt.setString(1, userName);
		ResultSet res = pstmt.executeQuery();
		
		if (res.next()) {
			if(res.getString(3).equals(password)) { // 3rd column in table, is password
				System.out.println("Login success");
			} else {
				System.out.println("Invalid password");
			}
		} else {
			System.out.println("Invalid username");
		}
	}
}



