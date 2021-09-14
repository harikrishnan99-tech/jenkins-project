package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dao.UserleaveRepo;
import com.app.model.userleave;



@Service
public class UserleaveServiceImp implements UserleaveService {
	
	private UserleaveRepo userleaveRepository;
	
	public UserleaveServiceImp(UserleaveRepo  userleaveRepository )
	{
		super();
		this.userleaveRepository=userleaveRepository;
		
	}

	@Override
	public List<userleave> findAll() {
		// TODO Auto-generated method stub
		return userleaveRepository.findAll();
	}

	@Override
	public void save(userleave theUser) {
		// TODO Auto-generated method stub
		userleaveRepository.save(theUser);
		
	}

	@Override
	public List<userleave> getUserleave(int id) {
		// TODO Auto-generated method stub
		return userleaveRepository.getUserleave(id);
	}
}