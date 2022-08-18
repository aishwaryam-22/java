package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student=new Student();
		student.setName("tom");
		
		Address homeaddress=new Address();
		homeaddress.setStreet("rajajinagar road");
		homeaddress.setCity("bangalore");
		homeaddress.setState("karnataka");
		homeaddress.setZipcode("566010");
		
		//inject address to student table
		student.setAddress(homeaddress);
		
		//persist
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		

	}

}
