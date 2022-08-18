package com.cg.JPAstart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one emp
		Employee employee= new Employee();
		employee.setName("Tom");
		employee.setSalary(50000);
		em.persist(employee);
		
		//create one mgr
		Manager manager=new Manager();
		manager.setName("Aishwarya");
		manager.setSalary(100000);
		manager.setDeptname("IT");
		em.persist(manager);

		em.getTransaction().commit();
		System.out.println("added 1 mgr and 1 emp to database");
		em.close();
		factory.close();
	}

}
