package org.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public demo() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().println("Name: "+request.getParameter("name")+"<br/>");
		response.getWriter().println("Email: "+request.getParameter("email")+"<br/>");
		response.getWriter().println("Mobile No: "+request.getParameter("mobile")+"<br/>");
		doGet(request, response);
	}

}
