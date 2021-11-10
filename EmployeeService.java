package com.hcl.demo.service; // just an interface

import org.springframework.stereotype.Service;
import com.hcl.demo.controller.model.Employee;	 
import java.util.Optional;
import java.util.List;


@Service
public interface EmployeeService {

	public Employee createEmployee(Employee employee);

	public Optional<Employee> getEmployee(int id);

	public String deleteEmployee(int id);

	public Employee updateFirstName(String firstName, int id);
	
	public Employee updateLastName(String lastName, int id);
	
	public Employee updateSalary(double salary, int id);
	 
}