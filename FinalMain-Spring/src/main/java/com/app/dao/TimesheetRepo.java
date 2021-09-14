package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.model.timesheet;

@Repository
@CrossOrigin(origins ="http://localhost:4200")
public interface TimesheetRepo extends JpaRepository<timesheet,Integer> {
	
	@Query(value="SELECT * from timesheet where timesheet.id=:id",nativeQuery =true )
	public List<timesheet> getTimeSheet(@Param("id")int id);
	

}
