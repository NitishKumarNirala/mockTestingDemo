package com.gradle.service;

import java.util.List;
import java.util.Optional;

import com.gradle.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public List<Employee>getAllEmployee();
	
	public Optional<Employee>getEmployeeById(long id);
	
	public void deleteEmployee(long id);

}
