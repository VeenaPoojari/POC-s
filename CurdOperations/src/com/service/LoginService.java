package com.service;

import java.util.List;

import com.dao.LoginDao;
import com.model.Student;

public class LoginService {
	LoginDao loginDao=new LoginDao();
	public List<Student> login(Student student){
		
		return loginDao.login(student);
	}

}
