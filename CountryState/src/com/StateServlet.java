package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.State;

public class StateServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		
		Integer id=Integer.parseInt(request.getParameter("role"));
		System.out.println("id: "+id);
		ArrayList<State> states=new ArrayList<State>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/countrycity","root","root");
				Statement statement=connection.createStatement();
				String sql="SELECT * FROM state s , country c where s.country_id=c.country_id and s.country_id="+id;
				ResultSet resultSet=statement.executeQuery(sql);
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.write("<select>");
				out.write("<option>Select</option>");
				while(resultSet.next()){
					out.write("<option value=" + resultSet.getInt(1) + ">" + resultSet.getString(2) + "</option>");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
