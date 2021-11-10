package com.hcl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.demo.controller.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { 
	// WHICH OBJECT ARE YOU COMMUNICATING WITH, THE DATA TYPE OF THE PRIMARY KEY
}
