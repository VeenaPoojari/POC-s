package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncryptAndDecryptServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String Encrypted = UtilsSecure.encrypt(password);
		String Decrypted = UtilsSecure.decrypt(Encrypted);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<br/><br/>First Name = " + fname
				+ "<br/><br/>Last Name = " + lname + "<br/><br/>Email = "
				+ email + "<br/><br/>Password Encrypted = " + Encrypted
				+ "<br/><br/>Password Decrypted = " + Decrypted);
	}
}
