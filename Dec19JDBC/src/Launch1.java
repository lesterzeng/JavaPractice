// Create and read data in MySQL


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Launch1 {

	public static void main(String[] args) throws Exception{
		
		// 0) Connect to MySQL via terminal
		// /usr/local/mysql/bin/mysql -u root -p
		
	
		// 0.1) Create database and table
//		create database sample_acc_db;
//
//		use sample_acc_db;
//
//		create table student(id int(10), name varchar(25), marks1 int(10), marks2 int(10), marks3 int(10));
//
//		insert into student values(1, 'Rudresh', 81, 82, 83);
//
//		select * from student;
		
		// 1) Load Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		
		// 2) Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "rootroot");  
		System.out.println("Connection Established Successfuly");
		
		
		// 3) Read data 
		String s = "select * from student"; // reads everything
		
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(s);
		
		while(res.next()) {
			int id = res.getInt(1);
			String name = res.getString(2);
			int marks1 =  res.getInt(3);
			int marks2 =  res.getInt(4);
			int marks3 =  res.getInt(5);
			System.out.println(id + " " +name+ " " +marks1+ " " +marks2+ " " +marks3);
		}
	}
}

