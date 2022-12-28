// Insert data in MySQL




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Launch3 {

	public static void main(String[] args) throws Exception{
		
		// 0) *********** Connect to MySQL via terminal ************
		// /usr/local/mysql/bin/mysql -u root -p
		// mysql -u root -p
		
	
		// 0.1) Create database and table
//		create database sample_acc_db;
//
//		use sample_acc_db;
//
//		create table student(id int(10), name varchar(25), marks1 int(10), marks2 int(10), marks3 int(10));
//
//		insert into student values(1, 'Rudresh', 81, 82, 83);
//	
//
//		select * from student;
		
		// 1) Load Driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		
		// 2) Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "rootroot"); // default user and passowrd: root
		System.out.println("Connection Established Successfuly");
		
		
		// 3) Insert data
		String s = "insert into student values(?,?,?,?,?)"; 
		
		PreparedStatement pstmt = con.prepareStatement(s);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = scan.nextInt();
		System.out.println("Enter the name");
		String name = scan.next();
		System.out.println("Enter the marks1");
		int marks1 = scan.nextInt();
		System.out.println("Enter the marks2");
		int marks2 = scan.nextInt();
		System.out.println("Enter the marks3");
		int marks3 = scan.nextInt();
		
		pstmt.setInt(1,id); 
		pstmt.setString(2, name);
		pstmt.setInt(3, marks1);
		pstmt.setInt(4, marks2);
		pstmt.setInt(5, marks3);
		

		int rows = pstmt.executeUpdate();
		System.out.println(rows);

		
	}
}

