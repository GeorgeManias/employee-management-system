package com.georgiosManias.EmployeeManagementSystem.repository;

import com.georgiosManias.EmployeeManagementSystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
