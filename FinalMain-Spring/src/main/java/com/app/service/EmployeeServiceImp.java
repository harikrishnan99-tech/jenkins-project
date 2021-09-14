package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeRepo;
import com.app.model.employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	private EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeServiceImp(EmployeeRepo employeeRepo)
	{
		super();
		this.employeeRepo=employeeRepo;
	}

	@Override
	public List<employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public void save(employee _employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(_employee);
		
	}

	@Override
	public employee findById(int userId) {
		// TODO Auto-generated method stub
		Optional<employee> e=employeeRepo.findById(userId);
		//employee user=e.get();
		//return user;
		return e.get();
	}

	@Override
	public void deleteById(int employeeId) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(employeeId);
		
	}

	

	@Override
	public employee findByEmpid(int empid) {
		// TODO Auto-generated method stub
		Optional<employee> e=employeeRepo.findByEmpid(empid);
		employee user=e.get();
		return user;
		
	}

}
