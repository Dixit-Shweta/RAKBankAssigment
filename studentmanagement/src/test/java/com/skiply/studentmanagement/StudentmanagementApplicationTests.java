package com.skiply.studentmanagement;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.skiply.studentmanagement.dao.StudentRepository;
import com.skiply.studentmanagement.entities.Student;
import com.skiply.studentmanagement.services.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentmanagementApplicationTests {

	@Autowired
	private StudentService studentService;
	
	@MockBean
	private StudentRepository repository;
	
	@Test
	public void addStudentTest() {
		Student student = new Student(1,"Sumit","B", 98753421, "IRA", 100);
		when(repository.save(student)).thenReturn(student);
		assertEquals(student, studentService.addStudent(student));
	}

}
