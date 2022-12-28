package com.accenture.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Model {
	public Model(int id, String name, int marks1, int marks2, int marks3) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	// Should always keep it private
	private int id;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	// Perform insertion
	public int addResult() {
		try {
			// 1) Load Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			// 2) Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root",
					"rootroot");
			System.out.println("Connection Established Successfuly");

			// 3) Insert data
			String s = "insert into student values(?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(s);

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks1);
			pstmt.setInt(4, marks2);
			pstmt.setInt(5, marks3);

			int rows = pstmt.executeUpdate();
			return rows;
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
}
