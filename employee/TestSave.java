package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("vikas");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction = entityManager.getTransaction();
	    
	    Employee employee = new Employee();
	    //employee.setId(1);
	    employee.setName("PQRS");
	    employee.setEmail("pqrs@gmail.com");
	    employee.setCno(1342565777);
	    
	    entityTransaction.begin();
	    entityManager.persist(employee);
	    entityTransaction.commit();
	}
	

}
