package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeinfo")

public class employee {

	@Id
	@Column(name="id")
	private int id;
	

	
	@Column(name="name")
	private String name;
	
	
	@Column(name="post")
	private String post;

	
	@Column(name="password")
	private String password;

	
	@Column(name="email")
	private String email;

	
	@Column(name="gender")
	private String gender;
	

	
	@Column(name="empid")
	private int empid;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPost() {
		return post;
	}



	public void setPost(String post) {
		this.post = post;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public employee() {
		super();
	}



	public employee(int id, String name, String post, String password, String email, String gender, int empid) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.empid = empid;
	}
	
	


	
	

}
