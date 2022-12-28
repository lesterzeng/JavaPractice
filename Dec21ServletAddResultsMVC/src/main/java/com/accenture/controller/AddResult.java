package com.accenture.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accenture.model.Model;

public class AddResult extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int marks1 = Integer.parseInt(request.getParameter("marks1"));
		int marks2 = Integer.parseInt(request.getParameter("marks2"));
		int marks3 = Integer.parseInt(request.getParameter("marks3"));
		
		
		
		Model m = new Model(id, name, marks1, marks2, marks3);
		int rows = m.addResult();
		
		if(rows==0) {
			response.sendRedirect("/Dec21ServletAddResultsMVC/failure.html");
		} else {
			response.sendRedirect("/Dec21ServletAddResultsMVC/success.html");
		}
		
		
		
	}

}
