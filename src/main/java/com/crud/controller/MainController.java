package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1/")
public class MainController {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	//this function returns all the employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		
		return employeeRepo.findAll();
	}

}
