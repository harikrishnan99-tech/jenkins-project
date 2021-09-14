package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.timesheet;
import com.app.service.TimesheetService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class timesheetController {
	private TimesheetService timesheetSev;
	
	@Autowired
	public timesheetController(TimesheetService timesheetSev)
	{
		super();
		this.timesheetSev=timesheetSev;
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("/timesheet")
	public List<timesheet> findAll()
	{
		return timesheetSev.findAll();
	}
	
	
	@CrossOrigin(origins ="http://localhost:4200")
	@PostMapping("/timesheet")
	public timesheet addTimesheet(@RequestBody timesheet theEmployee)
	{
		theEmployee.setId(0);
		timesheetSev.save(theEmployee);
		return theEmployee;
		
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@PutMapping("/timesheet")
	public timesheet updateEmployee(@RequestBody timesheet theEmployee)
	{
		timesheetSev.save(theEmployee);
		return theEmployee;
	}
	
	
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("/timesheet/{id}")
	public List<timesheet> updateTime(@PathVariable int id)
	{
		List<timesheet> ts=timesheetSev.getTimeSheet(id);
		return ts;
	}
	
	
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("/timesheet/{userid}")
	public timesheet searchUser(@PathVariable int userId)
	{
		timesheet theEmployee = timesheetSev.findById(userId);
		return theEmployee;
	}
	
	

}
