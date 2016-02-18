package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Stud;
import com.model.Student;
import com.dao.StudentDao;

public class StudentService {
	StudentDao addStudentDao=new StudentDao();
	public List<Student> editRecord(Integer rollno){
		return addStudentDao.editRecord(rollno);
	}
	
	public List<Student> updateDate(Student student){
		return addStudentDao.updateData(student);
	}

}
