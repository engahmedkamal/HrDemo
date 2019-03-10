package com.pilot.demo.repository;

import com.pilot.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findAll();
}
