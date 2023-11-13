package com.pract;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public final class TestCon {

	public static void main(String[] args){
		// TODO Auto-generated method stub
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sf =cfg.buildSessionFactory();
			
			Session s =sf.openSession();
			
			Transaction tranc =s.beginTransaction();
			
			
			Student student=new Student();
			student.setFname("Prajwal");
			student.setLname("Nagrale");
			
			s.save(student);
			tranc.commit();
	}

}
