import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Print extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		// prints on the browser, not console
		out.println("Hello client, how are you?");
	}

}

//Creating a new J2EE Project
//File --> New --> Others --> Search Dynamic Web Project --> Add proj name --> New Runtime --> Apache, v7.0 --> Browse --> Tomcat 7.0 select folder --> Finish --> Dynamic web module version select 2.4 --> Finish --> Open J2 EE Perspective? "Yes"
//
//
//Creating a Servlet
//Right-Click the project --> Create New --> Servlet --> Ensure Project Name is correctly selected --> Create a java package if you need to, but if default, leave as empty --> Fill in project name e.g. "Print.java" --> Finish
//
//Running your project
//Right-Click the project --> Run As --> Run on Server --> Select Apache - Tomcat v7.0
//--> A window will auto open. --> Make sure to adjust the url to reflect the java file you want to display