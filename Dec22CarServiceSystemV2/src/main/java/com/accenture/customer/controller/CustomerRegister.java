package com.accenture.customer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accenture.customer.model.CustomerModel;

public class CustomerRegister extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		// Create session //////
		HttpSession session = request.getSession(true);
		session.setAttribute("name", name);

		////////////////////

		CustomerModel tempCustomer = new CustomerModel(name, username, password, email);
		int x = tempCustomer.addInfo();

		if (x == -1) {
			response.sendRedirect("/Dec22CarServiceSystemV2/duplicateUsername.jsp");
		} else {
			response.sendRedirect("/Dec22CarServiceSystemV2/registerSuccess.jsp");
		}
	}

}
