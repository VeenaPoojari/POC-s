package com.action;

import java.util.ArrayList;
import java.util.List;

import com.model.Stud;
import com.model.Student;
import com.service.StudentService;

public class StudentAction {

	Student student=new Student();
	Integer rollno;
	String studName, lname, uname, pass;
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	List<Student> studentList=new ArrayList<Student>();
	StudentService studentService=new StudentService();
	
	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String editRecord(){
		System.out.println("Roll no"+getRollno());
		studentList=studentService.editRecord(getRollno());
		System.out.println(studentList);
		return "edit";
	}
	
	public String updateData(){
		System.out.println(getRollno()+"\t"+getStudName()+"\t"+getLname()+"\t"+getUname()+"\t"+getPass());
		student.setRollno(getRollno());
		student.setStudName(getStudName());
		student.setLname(getLname());
		student.setUname(getUname());
		student.setPass(getPass());
		System.out.println(getRollno()+"\t"+getStudName()+"\t"+getUname()+"\t"+getPass());
		studentList=studentService.updateDate(student);
		return "success";
	}
}
