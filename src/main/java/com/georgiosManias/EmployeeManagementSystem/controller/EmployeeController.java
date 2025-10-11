package com.georgiosManias.EmployeeManagementSystem.controller;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import com.georgiosManias.EmployeeManagementSystem.payload.request.EmployeeRequest;
import com.georgiosManias.EmployeeManagementSystem.payload.response.EmployeeResponse;
import com.georgiosManias.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return ResponseEntity.ok(employeeService.createEmployee(employeeRequest));
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


    @GetMapping("/search")
    public List<Employee> searchByFullnameAndAge(@RequestParam(required = false) String fullname, @RequestParam(required = false) Integer age) {
        if (fullname != null && age != null) {
            return employeeService.searchByFullnameAndAge(fullname, age);
        } else if (fullname != null) {
            return employeeService.searchByFullname(fullname);
        } else if (age != null) {
            return employeeService.searchByAge(age);
        } else {
            return List.of();
        }
    }

}





















