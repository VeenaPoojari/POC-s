package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendMail extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String subject = request.getParameter("subject");
		String msg = request.getParameter("msg");
		System.out.println(from+to+subject+msg);
		Mailer.send(from, to, subject, msg);
		out.print("message has been sent successfully");
		out.close();
	}

}