package com.cg.service;

import com.cg.entity.Student;

public interface studentservice {

	public abstract Student getStudentById(int id); //r
	public abstract void addStudent(Student student); //c
	public abstract void removeStudent(Student student); //d
	public abstract void updateStudent(Student student);//u
}
