package com.hcl.demo.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee") // A TABLE IS CREATED CALLED EMPLOYEE IN THE DATABASE. USE SAME NAME AS CLASS NAME.
public class Employee {

	@Id // IDENTIFIES THE PRIMARY KEY. ASSIGNING EMPLOYEE ID AS THE PRIMARY KEY.
	@GeneratedValue(strategy = GenerationType.AUTO) // YOU DON'T NEED TO INPUT ANY VALUES BC JAVAX.PERSISTENCE WILL AUTO.
	private int id;
	@Column(name = "firstName") // COLUMNS = INFORMATION OF THE EMPLOYEE.
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "salary")
	private Double salary;
	
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	public String getLastName() {
	return lastName;
	}
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
	public Double getSalary() {
	return salary;
	}
	public void setSalary(Double salary) {
	this.salary = salary;
	}
	
@Override
	public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}