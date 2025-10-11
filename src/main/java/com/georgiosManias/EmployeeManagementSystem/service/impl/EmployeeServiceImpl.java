package com.georgiosManias.EmployeeManagementSystem.service.impl;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import com.georgiosManias.EmployeeManagementSystem.payload.request.EmailDetails;
import com.georgiosManias.EmployeeManagementSystem.payload.request.EmployeeRequest;
import com.georgiosManias.EmployeeManagementSystem.payload.response.EmployeeResponse;
import com.georgiosManias.EmployeeManagementSystem.repository.EmployeeRepository;
import com.georgiosManias.EmployeeManagementSystem.service.EmailService;
import com.georgiosManias.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmailService emailService;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmailService emailService) {
        this.employeeRepository = employeeRepository;
        this.emailService = emailService;
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setFullname(employeeRequest.getFullname());
        employee.setAge(employeeRequest.getAge());
        employee.setEmail(employeeRequest.getEmail());
        employee.setDepartmentID(employeeRequest.getDepartmentID());
        employee.setPassword(employeeRequest.getPassword());
        employeeRepository.save(employee);

        EmailDetails emailDetails = new EmailDetails();
        emailDetails.setRecipient(employee.getEmail());
        emailDetails.setSubject("Account Creation");
        emailDetails.setMessageBody("CONGRATULATIONS! " + employee.getFullname() +
                " Your Account Has Been Successfully Created.");
        emailService.sendEmailAlert(emailDetails);

        EmployeeResponse response = new EmployeeResponse();
        response.setFullname(employee.getFullname());
        response.setAge(employee.getAge());
        response.setDepartmentID(employee.getDepartmentID());
        response.setEmail(employee.getEmail());

        return response;
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
    public List<Employee> searchByFullname(String fullname){
        return employeeRepository.searchByFullname(fullname);
    }

    @Override
    public List<Employee> searchByAge(Integer age){
        return employeeRepository.searchByAge(age);
    }

    @Override
    public List<Employee> searchByFullnameAndAge(String fullname, Integer age) {
        return employeeRepository.searchByFullnameAndAge(fullname, age);
    }


}
