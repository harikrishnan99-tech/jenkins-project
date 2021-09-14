package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.EmployeeRepo;
import com.app.model.admin;
import com.app.model.employee;
import com.app.service.EmployeeService;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class employeeController {
	
	private EmployeeService employeeService;
	private EmployeeRepo employeeRepo;
	
	@Autowired
	public employeeController(EmployeeService employeeService)
	{
		super();
		this.employeeService=employeeService;
		
	}
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("/employees")
	public List<employee> findAll()
	{
		return employeeService.findAll();
		
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("/employees/{userid}")
	public employee searchemp(@PathVariable int userid)
	{
		employee _employee=employeeService.findById(userid);
		return _employee;
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@PostMapping("/employees")
	public employee addemp(@RequestBody employee _employee)
		{
			_employee.setId(0);
			employeeService.save(_employee);
			return _employee;
					
		}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@PutMapping("/employees/update")
	public employee updateemp(@RequestBody employee _employee)
		{
			employeeService.save(_employee);
			return _employee;
						
		}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@DeleteMapping("/employees/{employeeId}")
	public String deleteemp(@PathVariable int employeeId)
			{
				employee _employee=employeeService.findById(employeeId);
				if(_employee==null)
				{
					throw new RuntimeException(employeeId+"Not Found");
				}
				employeeService.deleteById(employeeId);
				return employeeId+"Deleted";
			}
	
	
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("employee/{empid}")
	public employee getemp(@PathVariable int empid)
	{
		employee _employee = employeeService.findByEmpid(empid);
		return _employee;
	}
	
	

}
