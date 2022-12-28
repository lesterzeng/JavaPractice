import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



// Practice - with validation 

public class LaunchUser1 {

	public static void main(String[] args) throws Exception {


		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "rootroot");
		System.out.println("Connection Established Successfully");
		
		
		String s = "insert into user values(?,?,?,?,?)"; 
		
		PreparedStatement pstmt = con.prepareStatement(s);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the id.");
		int id = scan.nextInt();
		System.out.println("Enter name.");
		String name = scan.next();
		System.out.println("Enter password. (Minimum 8 characters)");
		String password = scan.next();
		System.out.println("Enter email.");
		String email = scan.next();
		System.out.println("Enter phone. (Must be 8 digits)");
		int phone = scan.nextInt();
		
		
		pstmt.setInt(1, id);
		// Question - how to access to table's id to prevent duplicate? 
		
		pstmt.setString(3, name);
		
		if (password.length()<8) {
			System.out.println("Password is too short. Minimum 8 characters");
		} else {
		pstmt.setString(2, password);
		}
		
		if (email.contains("@")) {
		pstmt.setString(4, email);
		} else {
			System.out.println("Email must contain @");
		}
		
		
		String pstring = Integer.toString(phone);
		
		if (pstring.length()!=8) {
			System.out.println("Phone number is invalid. It has 8 digits.");
		} else {
		pstmt.setInt(5, phone);
		}
		
		int rows = pstmt.executeUpdate();
		System.out.println(rows + " row/s accepted");
		
	}

}
