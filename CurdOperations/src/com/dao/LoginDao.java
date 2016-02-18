package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.HibernateUtility;

public class LoginDao {

	public List<Student> login(Student student){
		List<Student> lisStudents = null;
		Session session=HibernateUtility.getConnection().openSession();
		System.out.println("---------Dao---------");
		System.out.println(student.getUname());
		System.out.println(student.getPass());

		String sql="from Student where uname='"+student.getUname()+"' and pass='"+student.getPass()+"'";
		Query query=session.createQuery(sql);
		System.out.println("query: "+query);
		List<Student> listS=query.list();
		if(!listS.isEmpty()){
			System.out.println("listS: "+listS);
			Iterator itr=listS.iterator();
		
			System.out.println("Success..");
			query=session.createQuery("from Student");
			lisStudents=query.list();
			Iterator itr1=lisStudents.iterator();
			while(itr1.hasNext()){
				Student stud=(Student)itr1.next();
				System.out.println(stud.getStudName()+"\t"+stud.getLname()+"\t"+stud.getUname()+"\t"+stud.getPass());
			}
		}
		session.beginTransaction().commit();
		
		return lisStudents;
	}
}
/*query=session.createQuery("select s.stud_name, b.batch_name, f.faculty_name, c.course_name "
					+ "from student s, batch b, faculty f, course c where s.batch_id=b.batch_id and "
					+ "b.faculty_id=f.faculty_id and f.course_id=c.course_id");*/