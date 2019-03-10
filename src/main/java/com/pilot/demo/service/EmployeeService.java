package com.pilot.demo.service;

import com.pilot.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    void save(Employee employee);
}
