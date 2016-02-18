package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataAccessObject {
	private static Connection con;
	private static final String Driver = "com.mysql.jdbc.Driver";
	private static final String ConnectionString = "jdbc:mysql://localhost:3306/jtable";
	private static final String user = "root";
	private static final String pwd = "root";

	public DataAccessObject() {
	}
	public static Connection loadDriver() throws SQLException {
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		con = DriverManager.getConnection(ConnectionString, user, pwd);
		return con;
	}

	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}