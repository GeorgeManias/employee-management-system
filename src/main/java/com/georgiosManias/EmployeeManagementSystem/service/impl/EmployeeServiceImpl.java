package com.georgiosManias.EmployeeManagementSystem.service.impl;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import com.georgiosManias.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private Map<Long, Employee> employees = new HashMap<>();

    @Override
    public Employee createEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public Collection<Employee> getAllEmployees() {
        return employees.values();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employees.get(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        employee.setId(id);
        employees.put(id,employee);
        return employee;
    }

    @Override
    public String deleteEmployee(Long id) {
        employees.remove(id);
        return "The employee with id"+id +", has been removed";
    }
}
