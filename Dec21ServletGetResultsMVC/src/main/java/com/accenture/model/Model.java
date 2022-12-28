package com.accenture.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Continued on 22 Dec

public class Model {
	private int id;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	private ResultSet res = null;

	public Model(int id, String name, int marks1, int marks2, int marks3) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public Model() {

	}

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

	public int getResult() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root",
					"rootroot");
			System.out.println("Connection established successfully");

			String s = "select * from student where id=?";

			PreparedStatement pstmt = con.prepareStatement(s);

			pstmt.setInt(1, id);

			res = pstmt.executeQuery();

			if (res == null) {
				return 0;
			} else {
				while (res.next()) {
					id = res.getInt(1);
					name = res.getString(2);
					marks1 = res.getInt(3);
					marks2 = res.getInt(4);
					marks3 = res.getInt(5);
				}
				return 1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
