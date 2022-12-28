

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Redirect to display.html

public class Welcome extends HttpServlet {

	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("/my-second-web-project/display.html"); // To redirect for html to be sent instead
	}


}
