package com.Springbootproject5.SpringdataCRUDoperations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springbootproject5.SpringdataCRUDoperations.entity.Employee;
import com.Springbootproject5.SpringdataCRUDoperations.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	public Employee save(Employee emp) {
		 return employeeRepository.save(emp);
	
	}
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
}
