package com.cg.service;

import com.cg.dao.Studentdao;
import com.cg.dao.Studentdaoimpl;
import com.cg.entity.Student;

public class studentserviceimpl implements studentservice {
	private Studentdao dao;
	
	public studentserviceimpl() {
		dao=new Studentdaoimpl();
	}

	@Override
	public Student getStudentById(int id) {
		Student student=dao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.commitTransaction();
		dao.addStudent(student);
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.commitTransaction();
		dao.beginTransaction();
		dao.removeStudent(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.commitTransaction();
		dao.updateStudent(student);
		
	}

}
