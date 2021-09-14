package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.dao.TimesheetRepo;
import com.app.model.timesheet;

@Service
public class TimesheetServiceImp implements TimesheetService {
	
	private TimesheetRepo timesheetRepository;
	
	public TimesheetServiceImp(TimesheetRepo  timesheetRepository )
	{
		super();
		this.timesheetRepository=timesheetRepository;
		
	}
	

	@Override
	public List<timesheet> findAll() {
		// TODO Auto-generated method stub
		return timesheetRepository.findAll();
	}

	@Override
	public  void save(timesheet theEmployee) {
		// TODO Auto-generated method stub
		 timesheetRepository.save(theEmployee);
	}
		
	

	@Override
	public List<timesheet> getTimeSheet(int id) {
		// TODO Auto-generated method stub
		return timesheetRepository.getTimeSheet(id);
	}

	@Override
	public timesheet findById(int userid) {
		// TODO Auto-generated method stub
		Optional<timesheet> u=timesheetRepository.findById(userid);
		timesheet theUser=u.get();
		return theUser;
	}
	

}
