package com.skiply.studentmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skiply.studentmanagement.dao.StudentRepository;
import com.skiply.studentmanagement.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	/*
	 * 
	 * List<Student> list;
	 * 
	 * public StudentServiceImpl() {
	 * 
	 * list = new ArrayList<>(); list.add(new Student(145,"Shweta","A",
	 * 997788999,"IRA")); }
	 */
	
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public Student addStudent(Student student) {
		//list.add(student);
		return studentRepository.save(student);
	}

	
}
