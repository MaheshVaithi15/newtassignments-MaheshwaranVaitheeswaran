package org.example;

import java.io.IOException;
import java.util.*;

import org.example.entity.User;
import org.example.model.UsersModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page").toLowerCase();
		
		switch(page) {
		case "home":{
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;	
		}
		case "listusers":{
			
			List<User> users = new ArrayList<>();
			users = new UsersModel().listuser();
			request.setAttribute("listusers",users);
			request.getRequestDispatcher("listusers.jsp").forward(request, response);
			break;	
		}
		default:
			request.getRequestDispatcher("error.jsp").forward(request, response);
			break;	
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
