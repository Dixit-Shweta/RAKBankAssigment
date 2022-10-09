package com.skiply.feecollection.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
public class Fees {

	public Fees() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long refID;
	
	private long cardNumber;
	private String cardType;
	private int amount;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;
	
	private Date currentdate;

	public Fees(long refID, long cardNumber, String cardType, int amount, Student student, Date currentdate) {
		super();
		this.refID = refID;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.amount = amount;
		this.student = student;
		this.currentdate = currentdate;
	}


	public long getRefID() {
		return refID;
	}

	public void setRefID(long refID) {
		this.refID = refID;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
