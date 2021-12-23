package com.crud.controller;

import java.util.List;

import com.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1/")
public class MainController {
	
	@Autowired
	EmployeeService employeeService;
	
	//this function returns all the employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return  employeeService.getAllEmployees();
	}

	@PostMapping("/add-employee")
	public Employee addEmployee(@RequestBody Employee employee){
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/get-employee/{id}")
	public Employee getEmployeeById(@PathVariable Long id){

		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/delete-employee/{id}")
	public void deleteEmployeeById(@PathVariable Long id){
		employeeService.deleteEmloyeeById(id);
	}

	@GetMapping("/find-by-first-name/{name}")
	public List<Employee> findByFirstName(@PathVariable("name") String firstName){
		return employeeService.findByFirstName(firstName);
	}
}
