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
import com.app.model.userleave;
import com.app.service.TimesheetService;
import com.app.service.UserleaveService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")

public class userleaveController {
	private UserleaveService userleaveSev;
	
	@Autowired
	public userleaveController(UserleaveService userleaveSev)
	{
		super();
		this.userleaveSev=userleaveSev;
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("/userleave")
	public List<userleave> findAll()
	{
		return userleaveSev.findAll();
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@PostMapping("/userleave")
	public userleave addUserleave(@RequestBody userleave theUser)
	{
		theUser.setId(0);
		userleaveSev.save(theUser);
		return theUser;
		
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@PutMapping("/userleave")
	public userleave updateUser(@RequestBody userleave theUser)
	{
		userleaveSev.save(theUser);
		return theUser;
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("/userleave/{id}")
	public List<userleave> updateUserleave(@PathVariable int id)
	{
		List<userleave> ts=userleaveSev.getUserleave(id);
		return ts;
	}
	
	

}
