package com.jsp.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entitymanager.getTransaction();
		
		Student student = new Student();
		student.setName("XYZ");
		student.setEmail("mno@mail.com");
		student.setCno(1543768245);
		
		
		entityTransaction.begin();
		entitymanager.persist(student);
		entityTransaction.commit();
	}

}
