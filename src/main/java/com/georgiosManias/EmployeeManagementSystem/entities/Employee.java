package com.georgiosManias.EmployeeManagementSystem.entities;

public class Employee {
    private long id;

    private String fullname;

    private int age;

    private int departmentID;


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

    //Getters - Setters END
    //========================


    public Employee(long id, String fullname, int age, int departmentID) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.departmentID = departmentID;
    }

    public Employee() {

    }
}
