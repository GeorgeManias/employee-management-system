package com.georgiosManias.EmployeeManagementSystem.repository;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> searchByFullname(String fullname);

    List<Employee> searchByAge(Integer age);

    List<Employee> searchByFullnameAndAge(String fullname, Integer age);

}
