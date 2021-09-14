package com.app.service;

import java.util.List;

import com.app.model.timesheet;

public interface TimesheetService {
	
	List<timesheet> findAll();
	void save(timesheet theEmployee);
	public List<timesheet> getTimeSheet(int id);
	timesheet findById(int userid);

}
