package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	Connection connection = null;
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/defecttrackingsystem","root","root");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
