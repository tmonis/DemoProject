package com.hcl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.demo.controller.model.Employee;
import com.hcl.demo.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Optional;

@RestController 
public class DemoController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping(path = "/employees/{id}")
	public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable int id) throws JsonMappingException, JsonProcessingException
	{
		return new ResponseEntity<>(employeeService.getEmployee(id), HttpStatus.OK);
	}
	
	@PostMapping(path = "/employees", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
			public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
			throws JsonMappingException, JsonProcessingException {
			System.out.println(employee);
			return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.OK);
		}
	
	@DeleteMapping(path ="/employees/{id}", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
			public ResponseEntity<String> deleteEmployee(@PathVariable int id)throws JsonMappingException, JsonProcessingException
			{
				return new ResponseEntity<String>(employeeService.deleteEmployee(id), HttpStatus.OK);
			}
	
	@PutMapping(path ="/employees/{id}/firstName", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Employee> updateFirstName(@RequestBody String firstName,@PathVariable int id) throws JsonMappingException, JsonProcessingException
	{
		return new ResponseEntity<>(employeeService.updateFirstName(firstName, id), HttpStatus.OK);
	}
	
	@PutMapping(path ="/employees/{id}/lastName", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Employee> updateLastName(@RequestBody String lastName,@PathVariable int id) throws JsonMappingException, JsonProcessingException
	{
		return new ResponseEntity<>(employeeService.updateLastName(lastName,id), HttpStatus.OK);
	}
	
	@PutMapping(path ="/employees/{id}/salary", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Employee> updateSalary(@RequestBody double salary,@PathVariable int id) throws JsonMappingException, JsonProcessingException
	{
		return new ResponseEntity<>(employeeService.updateSalary(salary,id), HttpStatus.OK);
	}
}
	
  