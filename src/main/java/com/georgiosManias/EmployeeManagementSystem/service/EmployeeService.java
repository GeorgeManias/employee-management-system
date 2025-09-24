package com.georgiosManias.EmployeeManagementSystem.service;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;

import java.util.List;

public interface EmployeeService {
    //Create
    Employee createEmployee(Employee employee);

    //GetAll
    List<Employee> getAllEmployees();

    //Get
    Employee getEmployee(Long id);

    //Update
    Employee updateEmployee(Long id, Employee employee);

    //Delete
    String deleteEmployee(Long id);

    //GetByFullname
    Employee getEmployeeByFullname(String fullname);

    //GetByAge
    List<Employee> getEmployeeByAge(int age);

}

