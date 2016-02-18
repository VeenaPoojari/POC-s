package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.DataAccessObject;
import com.model.Student;

public class CrudDao {

	private Connection dbConnection;
	private PreparedStatement pStmt;

	public CrudDao() {
		try {
			dbConnection = DataAccessObject.loadDriver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addStudent(Student student) {
		String insertQuery = "INSERT INTO STUDENT(STUDENTID, NAME, "
				+ "DEPARTMENT, EMAIL) VALUES (?,?,?,?,?,?)";
		try {
			pStmt = dbConnection.prepareStatement(insertQuery);
			pStmt.setInt(1, student.getStudentId());
			pStmt.setString(2, student.getName());
			pStmt.setString(3, student.getDepartment());
			pStmt.setString(4, student.getEmailId());
			pStmt.setString(5, student.getUsername());
			pStmt.setString(6, student.getPassword());
			pStmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public void deleteStudent(int userId) {
		String deleteQuery = "DELETE FROM STUDENT WHERE STUDENTID = ?";
		try {
			pStmt = dbConnection.prepareStatement(deleteQuery);
			pStmt.setInt(1, userId);
			pStmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public void updateStudent(Student student) {
		String updateQuery = "UPDATE STUDENT SET NAME = ?, "
				+ "DEPARTMENT = ?, EMAIL = ?, USERNAME = ?, PASSWORD = ? WHERE STUDENTID = ?";
		try {
			pStmt = dbConnection.prepareStatement(updateQuery);
			pStmt.setString(1, student.getName());
			pStmt.setString(2, student.getDepartment());
			pStmt.setString(3, student.getEmailId());
			pStmt.setInt(4, student.getStudentId());
			pStmt.setString(5, student.getUsername());
			pStmt.setString(6, student.getPassword());
			pStmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();

		String query = "SELECT * FROM STUDENT ORDER BY STUDENTID";
		try {
			Statement stmt = dbConnection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Student student = new Student();

				student.setStudentId(rs.getInt("STUDENTID"));
				student.setName(rs.getString("NAME"));
				student.setDepartment(rs.getString("DEPARTMENT"));
				student.setEmailId(rs.getString("EMAIL"));
				student.setUsername(rs.getString("USERNAME"));
				student.setPassword(rs.getString("PASSWORD"));
				students.add(student);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return students;
	}
}