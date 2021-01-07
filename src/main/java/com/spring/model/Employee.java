package com.spring.model;

import java.time.LocalDateTime;

public class Employee {
    private int empId;
    private String empName;
    private String department;
    private String city;
    private LocalDateTime joinDate;

    public Employee() {

    }

    public Employee (int empId, String empName, String department, String city,
                     LocalDateTime joinDate) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.city = city;
        this.joinDate = joinDate;
    }

    public int getEmpId () {
        return this.empId;
    }

    public void setEmpId (int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }
}
