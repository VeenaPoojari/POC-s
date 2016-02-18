package com.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.model.Stud;
import com.model.Student;

import org.hibernate.Query;
import org.hibernate.Session;

import com.util.HibernateUtility;;

public class StudentDao {

	Session session=HibernateUtility.getConnection().openSession();
	List<Student> lisStudent = null;
	
	public List<Student> editRecord(Integer rollno){

		String sql="from Student where rollno="+rollno;
		Query query=session.createQuery(sql);
//		System.out.println("query: "+query);
		List<Student> listS=query.list();
		if(!listS.isEmpty()){
			System.out.println("listS: "+listS);
			Iterator itr=listS.iterator();
			lisStudent=query.list();
			Iterator itr1=lisStudent.iterator();
			while(itr1.hasNext()){
				Student stud=(Student)itr1.next();
				System.out.println(stud.getStudName()+"\t"+stud.getLname()+"\t"+stud.getUname()+"\t"+stud.getPass());
			}
		}
		session.beginTransaction().commit();
		return lisStudent;
	}
	
	public List<Student> updateData(Student student){

		System.out.println("DAO---------");
		System.out.println(student.getRollno()+"\t"+student.getStudName()+"\t"+student.getUname()+"\t"+student.getPass());
		String sql="update student set stud_name='"+student.getStudName()+"' , "
				+ "lname='"+student.getLname()+"' , "
				+ "uname='"+student.getUname()+"' , pass='"+student.getPass()+"' where rollno="+student.getRollno();
		
		System.out.println(sql);
		//Query query=session.createQuery(sql);
		
		return null;
	}
}
