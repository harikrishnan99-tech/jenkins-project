package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.model.employee;

@Repository
@CrossOrigin(origins ="http://localhost:4200")
public interface EmployeeRepo extends JpaRepository<employee,Integer> {

	 public Optional<employee> findByEmpid(int id);
	
	

}
