package com.georgiosManias.EmployeeManagementSystem.service;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import com.georgiosManias.EmployeeManagementSystem.payload.request.EmployeeRequest;
import com.georgiosManias.EmployeeManagementSystem.payload.response.EmployeeResponse;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface EmployeeService {
    //Create
    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);

    //GetAll
    List<Employee> getAllEmployees();

    //Get
    Employee getEmployee(Long id);

    //Update
    Employee updateEmployee(Long id, Employee employee);

    //Delete
    String deleteEmployee(Long id);

    List<Employee> searchByFullname(String fullname);

    List<Employee> searchByAge(Integer age);

    List<Employee> searchByFullnameAndAge(String fullname, Integer age);
}

