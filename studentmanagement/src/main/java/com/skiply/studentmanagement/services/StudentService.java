package com.skiply.studentmanagement.services;

import java.util.List;

import com.skiply.studentmanagement.entities.Student;

public interface StudentService {
	
	public List<Student> getStudent();
	
	public Student addStudent(Student student);

	
}
