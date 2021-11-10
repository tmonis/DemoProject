package com.hcl.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.demo.controller.model.Employee;

import com.hcl.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	@Override // SAVING AN EMPLOYEE
	public Employee createEmployee(Employee employee) {
		Employee savedObject = employeeRepository.save(employee);
		return savedObject;
	}
	
	@Override // GETTING AN EMPLOYEE
	public Optional<Employee> getEmployee(int id) {
		return employeeRepository.findById(id);
	}
	
	@Override
	public String deleteEmployee(int id) {
		Optional <Employee> deleted = employeeRepository.findById(id); // FIND THE ID YOU WANT TO DELETE
		employeeRepository.deleteById(id); // ACTUALLY DELETING THE EMPLOYEE
		return deleted.toString(); // RETURNS WHICH EMPLOYEE IS DELETED
	
	}
	
	@Override
	public Employee updateFirstName(String firstName, int id) {
		Optional<Employee> update = employeeRepository.findById(id); // FINDS THE ID YOU WANT TO UPDATE
		update.get().setFirstName(firstName); // USER WILL BE REQUIRED TO UPDATE ALL THE INFORMATION
		return employeeRepository.save(update.get()); // SAVES UPDATED EMPLOYEE INFORMATION
	}
	
	@Override
	public Employee updateLastName(String lastName, int id) {
		Optional<Employee> update = employeeRepository.findById(id); // FINDS THE ID YOU WANT TO UPDATE
		update.get().setLastName(lastName);
		return employeeRepository.save(update.get()); // SAVES UPDATED EMPLOYEE INFORMATION
	}
	
	@Override
	public Employee updateSalary(double salary, int id) {
		Optional<Employee> update = employeeRepository.findById(id); // FINDS THE ID YOU WANT TO UPDATE
		update.get().setSalary(salary);
		return employeeRepository.save(update.get()); // SAVES UPDATED EMPLOYEE INFORMATION
	}
				
				
}