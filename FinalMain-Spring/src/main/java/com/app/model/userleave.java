package com.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userleave")
public class userleave {
	

	@Id
	@Column(name="id")
	private int id;
	

	
	@Column(name="name")
	private String name;
	
	@Column(name="post")
	private String post;
	
	@Column(name="type")
	private String type;
	
	@Column(name="leavedate")
	private Date leavedate;
	
	@Column(name="days")
	private int days;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public userleave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public userleave(int id, String name, String post, String type, Date leavedate,int days) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
		this.type = type;
		this.leavedate = leavedate;
		this.days = days;
	}
	
	

}
