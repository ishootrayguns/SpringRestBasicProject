package com.spring.service;

import com.spring.dao.EmployeeDao;
import com.spring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employee;


    @Override
    public boolean addEmployee(Employee emp) {
        return employee.addEmployee(emp);

    }

    @Override
    public boolean updateEmployee(Employee emp) {
        return employee.updateEmployee(emp);
    }

    @Override
    public boolean deleteEmployee(int empId) {
        return employee.deleteEmployee(empId);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return employee.getEmployeeById(empId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employee.getAllEmployees();
    }
}
