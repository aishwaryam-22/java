package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class Studentdaoimpl implements Studentdao{
	
	private EntityManager manager;
	public Studentdaoimpl() {
		manager=JPAUtil.getEntityManager();
	}

	@Override
	public Student getStudentById(int id) {
		Student student =manager.find(Student.class, id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		manager.persist(student);
		
	}

	@Override
	public void removeStudent(Student student) {
		manager.remove(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		manager.merge(student);
		
	}

	@Override
	public void commitTransaction() {
		manager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		manager.getTransaction().begin();
		
	}

}
