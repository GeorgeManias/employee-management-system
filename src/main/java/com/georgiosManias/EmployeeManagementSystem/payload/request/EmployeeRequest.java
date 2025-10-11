package com.georgiosManias.EmployeeManagementSystem.payload.request;

public class EmployeeRequest {
    private long id;

    private String fullname;

    private int age;

    private int departmentID;

    private String email;

    private String password;

    public EmployeeRequest(long id, String fullname, int age, int departmentID, String email, String password) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.departmentID = departmentID;
        this.email = email;
        this.password = password;
    }

    public EmployeeRequest() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
