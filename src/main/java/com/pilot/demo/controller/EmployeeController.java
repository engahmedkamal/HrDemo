package com.pilot.demo.controller;

import com.pilot.demo.model.Employee;
import com.pilot.demo.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(path = "/")
    @ApiOperation(value = "get Data")
    public ResponseEntity<List<Employee>> findAll() {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }
    @PostMapping(path = "/")
    @ApiOperation(value = "Create data")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
