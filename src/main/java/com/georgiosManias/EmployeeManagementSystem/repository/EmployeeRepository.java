package com.georgiosManias.EmployeeManagementSystem.repository;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByFullname(String fullname);

    List<Employee> findByAge(int age);

}
