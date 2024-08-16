package com.jsp.spring_mvc_1.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lName;
	@Column(unique=true)
	private String email;
	private String pwd;
	private String gender;
	private long phone;
	private int age;
	
	public User(String fName, String lName, String email, String pwd, String gender, long phone, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
	}

	public User(int id, String fName, String lName, String email, String pwd, String gender, long phone, int age) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
	}
	

}
