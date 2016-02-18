package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private RequestDispatcher rd = null;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("admin") && password.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);;
		}
	}
}
