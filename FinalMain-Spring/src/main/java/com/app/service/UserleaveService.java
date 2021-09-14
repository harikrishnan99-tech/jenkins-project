package com.app.service;

import java.util.List;

import com.app.model.userleave;


public interface UserleaveService {
	List<userleave> findAll();
	void save(userleave theUser);
	public List<userleave> getUserleave(int id);
	//userleave findById(int userid);


}
