package com.crud.service;

import com.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //This is for to get all employees from the database
    public List<Employee> getAllEmployees();

    //This is for to save data to database
    public Employee saveEmployee(Employee employee);

    //This is for get the employee with the id
    public Employee getEmployeeById(Long id);

    //This is for the to delete the employee by its id
    public void deleteEmloyeeById(Long id);

}
