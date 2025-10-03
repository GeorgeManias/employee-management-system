package com.georgiosManias.EmployeeManagementSystem.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "employee_tbl")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fullname;

    private int age;

    private int departmentID;

    private String email;


    //========================
    //Getters - Setters START

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//Getters - Setters END
    //========================


    public Employee(long id, String fullname, int age, int departmentID, String email) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.departmentID = departmentID;
        this.email=email;
    }

    public Employee() {

    }
}
