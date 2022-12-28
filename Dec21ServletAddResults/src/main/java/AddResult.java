
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddResult extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			int marks1 = Integer.parseInt(request.getParameter("marks1"));
			int marks2 = Integer.parseInt(request.getParameter("marks2"));
			int marks3 = Integer.parseInt(request.getParameter("marks3"));

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

			PrintWriter out = response.getWriter();

			// if rows is 1, print out. in web to say data successfully added.

			if (rows == 0) {
				out.println("Data insertion failed");

			} else {
				out.println("Data insertion success");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
