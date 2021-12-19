package com.crud.service.impl;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepo;
import com.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public void deleteEmloyeeById(Long id) {
        employeeRepo.deleteById(id);

    }
}
