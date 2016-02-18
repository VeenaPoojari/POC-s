package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		System.out.println("un : " + username);
		String password = request.getParameter("password");
		final String ADMIN = "admin";
		HttpSession session = request.getSession();
		String msg = "Re-enter username and password";
		if (username == null && password == null) {
			System.out.println("error");
			
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		}else{
			if (username.equals(ADMIN) && password.equals(ADMIN)) {
				System.out.println("success");
				// getServletContext().setAttribute("attribute",
				// "attributeValue");
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				request.getRequestDispatcher("homepage.jsp").forward(request,
						response);
			} else {
				System.out.println("error");
				request.setAttribute("msg", msg);
				request.getRequestDispatcher("index.jsp").forward(request,
						response);
			}
		}
	}
}
