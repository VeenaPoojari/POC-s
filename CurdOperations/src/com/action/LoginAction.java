package com.action;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.service.LoginService;


public class LoginAction {
	Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	List<Student> studentList=new ArrayList<Student>();


	public String execute(){
		
		
		System.out.println("-------Action-------");
		System.out.println(student.getUname());
		System.out.println(student.getPass());
		if(!(student.getUname().equals("") || student.getPass().equals(""))){
			LoginService loginService=new LoginService();
			studentList=loginService.login(student);
			System.out.println(studentList);
			if(!studentList.isEmpty())
				return "success";
			else
				return "error";
		}
		else
			return "input";
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setI(List<Student> studentList) {
		this.studentList = studentList;
	}

}
