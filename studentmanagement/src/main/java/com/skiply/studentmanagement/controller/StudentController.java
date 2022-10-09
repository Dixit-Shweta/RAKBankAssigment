package com.skiply.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skiply.studentmanagement.entities.Student;
import com.skiply.studentmanagement.services.StudentService;
	
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//get list of students
	@GetMapping("/student")
	public List<Student> getStudents(){
		return this.studentService.getStudent();
	}
	
	//add student
	@PostMapping(path="/student", consumes = "application/json")
	public Student addStudent(@RequestBody Student student) {
		
		return this.studentService.addStudent(student);
	}
	
	
	
	
}
