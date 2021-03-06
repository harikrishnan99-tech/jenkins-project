package com.app.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timesheet")
public class timesheet {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="empid")
	private int empid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="tdate")
	private Date tdate;
	
	@Column(name="start")
	private Time start;
	
	@Column(name="end")
	private Time end;
	
	@Column(name="totalhours")
	private int totalhours;
	
	@Column(name="status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public Time getStart() {
		return start;
	}

	public void setStart(Time start) {
		this.start = start;
	}

	public Time getEnd() {
		return end;
	}

	public void setEnd(Time end) {
		this.end = end;
	}

	public int getTotalhours() {
		return totalhours;
	}

	public void setTotalhours(int totalhours) {
		this.totalhours = totalhours;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public timesheet(int id, int empid, String name, Date tdate, Time start, Time end, int totalhours, String status) {
		super();
		this.id = id;
		this.empid = empid;
		this.name = name;
		this.tdate = tdate;
		this.start = start;
		this.end = end;
		this.totalhours = totalhours;
		this.status = status;
	}
	
	

}
