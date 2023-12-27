package org.example;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class SessionForms extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public SessionForms() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("maheshvaithi") && password.equals("123456"))
		{
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
			newSession.setAttribute("username",username);
			//Cookie cookie = new Cookie("username",username);
			//response.addCookie(cookie);
			response.sendRedirect("member.jsp");
			}
		else
		{
			response.sendRedirect("index.jsp");
		}
	}

}
