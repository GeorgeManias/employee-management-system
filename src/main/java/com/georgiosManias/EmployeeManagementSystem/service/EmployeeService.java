package com.georgiosManias.EmployeeManagementSystem.service;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;

import java.util.Collection;

public interface EmployeeService {
    //Create
    Employee createEmployee(Employee employee);

    //GetAll
    Collection<Employee> getAllEmployees();

    //Get
    Employee getEmployee(Long id);

    //Update
    Employee updateEmployee(Long id, Employee employee);

    //Delete
    String deleteEmployee(Long id);
}
