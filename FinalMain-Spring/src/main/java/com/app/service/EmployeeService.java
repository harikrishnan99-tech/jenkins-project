package com.app.service;

import java.util.List;

import com.app.model.employee;

public interface EmployeeService {
	List<employee> findAll();
	
	void save(employee _employee);
	public employee findById(int userId);
	
	void deleteById(int employeeId);
	
	//int getCount();
	employee findByEmpid(int empid);
	
	
	

}
