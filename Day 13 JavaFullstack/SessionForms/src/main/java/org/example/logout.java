package org.example;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logout
 */
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public logout() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		switch(action) {
		case "destroy":{
			request.getSession().invalidate();
			/*Cookie[] cookies = request.getCookies();
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("username")) {
					cookie.setValue(null);
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}*/
			response.sendRedirect("index.jsp");
		}
		default:
			
		}
	}

}
