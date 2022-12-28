


// To get results from db back to frontend


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetResult extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String id = request.getParameter("id");
		int id = Integer.parseInt(request.getParameter("id")); // Shorter form - Refer line 35 ^

		//////// Accessing database ////////
		try {
			// 1) Load Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			// 2) Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root",
					"rootroot");
			System.out.println("Connection Established Successfully");

			String s = "select * from student where id=?";

			
			// Prepare the statement
			PreparedStatement pstmt = con.prepareStatement(s);

			pstmt.setInt(1, id);

			// Execute query
			ResultSet res = pstmt.executeQuery();

			while (res.next()) {
				int tempId = res.getInt(1);
				String tempName = res.getString(2);
				int tempMarks1 = res.getInt(3);
				int tempMarks2 = res.getInt(4);
				int tempMarks3 = res.getInt(5);

				// Get a pen
				PrintWriter out = response.getWriter();

//				***** Remember to add connector under deployment assembly, under the project file properties. *****
				// Print
				out.println("ID         Name         Marks1        Marks2        Mark3");
				out.println(tempId +"         "+ tempName +"       "+ tempMarks1 +"          "+ tempMarks2 +"            "+ tempMarks3);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
