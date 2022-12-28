package com.accenture.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accenture.model.Model;


public class GetResult extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		// Get from view
		int id = Integer.parseInt(request.getParameter("id"));
		
		Model m = new Model();
		m.setId(id);
		int x = m.getResult();
		
		
		//Push to View
		id = m.getId();
		String name = m.getName();
		int marks1 = m.getMarks1();
		int marks2 = m.getMarks2();
		int marks3 = m.getMarks3();
		
		// Create session
		HttpSession session = request.getSession(true);
		session.setAttribute("id", id); //id = id      use setAttribute to pass info to session
		session.setAttribute("name", name);
		session.setAttribute("marks1", marks1);
		session.setAttribute("marks2", marks2);
		session.setAttribute("marks3", marks3);
		
		if(x==1) {
			response.sendRedirect("/Dec21ServletGetResultsMVC/GetResultSuccess.jsp");
		} else {
			response.sendRedirect("/Dec21ServletGetResultsMVC/GetFailureSuccess.jsp");
		}
		
		
		
	}


}
