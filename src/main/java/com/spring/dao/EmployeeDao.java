package com.spring.dao;

import com.spring.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public boolean addEmployee(Employee emp);
    public boolean updateEmployee(Employee emp);
    public boolean deleteEmployee(int empId);
    public Employee getEmployeeById(int empId);
    public List<Employee> getAllEmployees();
}
