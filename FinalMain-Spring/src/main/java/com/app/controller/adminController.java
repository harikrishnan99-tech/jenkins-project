package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.admin;
import com.app.service.AdminService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins ="http://localhost:4200")
public class adminController {
	
	private AdminService adminService;
	
	@Autowired
	public adminController(AdminService adminService)
	{
		super();
		this.adminService=adminService;
	}
	
	@GetMapping("/admin")
	public List<admin> findAll()
	{
		return adminService.findAll();
		
	}

}
