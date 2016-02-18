package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CrudDao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Student;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CrudDao dao;

	public Controller() {
		dao = new CrudDao();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		List<Student> studentList = new ArrayList<Student>();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		response.setContentType("application/json");

		if (action != null) {
			if (action.equals("list")) {
				try {
					// Fetch Data from Student Table
					studentList = dao.getAllStudents();
					// Convert Java Object to Json
					String jsonArray = gson.toJson(studentList);

					// Return Json in the format required by jTable plugin
					jsonArray = "{\"Result\":\"OK\",\"Records\":" + jsonArray
							+ "}";
					response.getWriter().print(jsonArray);
				} catch (Exception e) {
					String error = "{\"Result\":\"ERROR\",\"Message\":"
							+ e.getMessage() + "}";
					response.getWriter().print(error);
					System.err.println(e.getMessage());
				}
			} else if (action.equals("create") || action.equals("update")) {
				Student student = new Student();
				if (request.getParameter("studentId") != null) {
					int studentId = Integer.parseInt(request
							.getParameter("studentId"));
					student.setStudentId(studentId);
				}

				if (request.getParameter("name") != null) {
					String name = request.getParameter("name");
					student.setName(name);
				}

				if (request.getParameter("department") != null) {
					String department = request.getParameter("department");
					student.setDepartment(department);
				}

				if (request.getParameter("emailId") != null) {
					String emailId = request.getParameter("emailId");
					student.setEmailId(emailId);
				}
				if (request.getParameter("username") != null) {
					String emailId = request.getParameter("username");
					student.setEmailId(emailId);
				}
				if (request.getParameter("password") != null) {
					String emailId = request.getParameter("password");
					student.setEmailId(emailId);
				}
				

				try {
					if (action.equals("create")) {
						// Create new record
						dao.addStudent(student);
						// Convert Java Object to Json
						String json = gson.toJson(student);
						// Return Json in the format required by jTable plugin
						String jsonData = "{\"Result\":\"OK\",\"Record\":"
								+ json + "}";
						response.getWriter().print(jsonData);
					} else if (action.equals("update")) {
						// Update existing record
						dao.updateStudent(student);
						// Convert Java Object to Json
						String json = gson.toJson(student);
						String jsonData = "{\"Result\":\"OK\",\"Record\":"
								+ json + "}";
						response.getWriter().print(jsonData);
					}
				} catch (Exception e) {
					String error = "{\"Result\":\"ERROR\",\"Message\":"
							+ e.getMessage() + "}";
					response.getWriter().print(error);
				}

			} else if (action.equals("delete")) {
				try {
					// Delete record
					if (request.getParameter("studentId") != null) {
						int studentId = Integer.parseInt(request
								.getParameter("studentId"));
						dao.deleteStudent(studentId);
						String jsonData = "{\"Result\":\"OK\"}";
						response.getWriter().print(jsonData);
					}
				} catch (Exception e) {
					String error = "{\"Result\":\"ERROR\",\"Message\":"
							+ e.getMessage() + "}";
					response.getWriter().print(error);
				}
			}
		}
	}
}