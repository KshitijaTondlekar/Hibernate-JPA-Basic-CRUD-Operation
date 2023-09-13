package com.jsp.student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql= "SELECT s FROM Student s";
		Query query = entityManager.createQuery(sql);
		List<Student>Students=query.getResultList();
		for(Student s:Students) {
			System.out.println("==================");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getCno());
			System.out.println("=================");
			
		}
	

	}

}
