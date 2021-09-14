package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.model.timesheet;
import com.app.model.userleave;

@Repository
@CrossOrigin(origins ="http://localhost:4200")
public interface UserleaveRepo extends JpaRepository<userleave,Integer> {
	@Query(value="SELECT * from userleave where userleave.id=:id",nativeQuery =true )
	public List<userleave> getUserleave(@Param("id")int id);
	

}
