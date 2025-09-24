package com.georgiosManias.EmployeeManagementSystem.service.impl;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import com.georgiosManias.EmployeeManagementSystem.repository.EmployeeRepository;
import com.georgiosManias.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    @Override
    public String deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
        return "The employee with id"+id +", has been removed";
    }

    @Override
    public Employee getEmployeeByFullname(String fullname) {
        return employeeRepository.findByFullname(fullname).orElse(null);
    }

    @Override
    public List<Employee> getEmployeeByAge(int age) {
        return employeeRepository.findByAge(age);
    }

}
