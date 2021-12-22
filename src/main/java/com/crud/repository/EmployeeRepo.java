package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

    // adding some custom finder methods form a database
    //This is the spring data supported keywords
    public List<Employee> findByFirstName(String firstName);

}
