package com.georgiosManias.EmployeeManagementSystem.controller;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import com.georgiosManias.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {
    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //Create
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    //Read All
    @GetMapping
    public Collection<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    //Read by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    //Update
    @PutMapping("/{id}")
    public Employee updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("fullname/{fullname}")
    public Employee getEmployeeByFullname(@PathVariable String fullname) {
        return employeeService.getEmployeeByFullname(fullname);
    }

    @GetMapping("age/{age}")
    public List<Employee> getEmployeeByAge(@PathVariable int age){
        return employeeService.getEmployeeByAge(age);
    }

}





















