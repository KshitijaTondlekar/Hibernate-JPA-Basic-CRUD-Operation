package com.jsp.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student student = entityManager.find(Student.class,1);
		
		
		System.out.println(student.getId());
		System.out.println(student.getCno());
		System.out.println(student.getName());
		System.out.println(student.getEmail());

	}

}
