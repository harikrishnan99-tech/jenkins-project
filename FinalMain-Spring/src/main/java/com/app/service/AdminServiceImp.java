package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminRepo;
import com.app.model.admin;

@Service
public class AdminServiceImp implements AdminService {
	
	private AdminRepo adminRepository;
	
	@Autowired
	public AdminServiceImp(AdminRepo adminRepository)
	{
		super();
		this.adminRepository=adminRepository;
	}

	@Override
	public List<admin> findAll() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

}
