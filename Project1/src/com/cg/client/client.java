package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.studentservice;
import com.cg.service.studentserviceimpl;

public class client {

	public static void main(String[] args) {
		
		Student student=new Student();
		studentservice service=new studentserviceimpl();
 
		//create
		student.setId(300);
		student.setName("Aishwarya");
		service.addStudent(student);
		System.out.println("the data is created");
		
		//retrieve
		student=service.getStudentById(300);
		System.out.println("id="+student.getId());
		System.out.println("name is"+student.getName());
		
		//update
		student=service.getStudentById(300);
		student.setName("Aishwarya Manjunath");
		service.updateStudent(student);
		System.out.println("updated");
		
		//delete
		//student=service.getStudentById(300);
		//service.removeStudent(student);
		//System.out.println("the data is removed");
		
		
	}

}
