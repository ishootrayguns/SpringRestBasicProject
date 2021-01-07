package com.spring.dao;

import com.spring.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    private List<Employee> allEmployees = new ArrayList<Employee>();

    @Override
    public boolean addEmployee(Employee emp) {
        allEmployees.add(emp);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        for(Employee employee : allEmployees) {
            if(employee.getEmpId() == emp.getEmpId()) {
                allEmployees.remove(employee);
                allEmployees.add(emp);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(int empId) {
        for(Employee employee : allEmployees) {
            if(employee.getEmpId() == empId) {
                allEmployees.remove(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee getEmployeeById(int empId) {
        for(Employee employee : allEmployees) {
            if(employee.getEmpId() == empId) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return allEmployees;
    }
}
