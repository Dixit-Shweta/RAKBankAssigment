package com.skiply.feecollection.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Student_Info")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int StudentID;
	
	private String Name;
	private String Grade;
	private long MobNumber;
	private String SchoolName;
	
	/*
	 * private Fees fees; public Fees getFees() { return fees; } public void
	 * setFees(Fees fees) { this.fees = fees; }
	 */
	//private int Fees;
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", Name=" + Name + ", Grade=" + Grade + ", MobNumber=" + MobNumber
				+ ", SchoolName=" + SchoolName + "]";
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = getGrade();
	}
	public long getMobNumber() {
		return MobNumber;
	}
	public void setMobNumber(int mobNumber) {
		MobNumber = mobNumber;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentID, String name, String grade, int mobNumber, String schoolName, int amount) {
		super();
		StudentID = studentID;
		Name = name;
		Grade = grade;
		MobNumber = mobNumber;
		SchoolName = schoolName;
		
	}
	
}
