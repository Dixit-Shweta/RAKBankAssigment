package com.skiply.studentmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skiply.studentmanagement.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
