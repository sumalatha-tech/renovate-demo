package com.springboot.renovate_demo.Service;

import com.springboot.renovate_demo.Dto.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployee(String id);
}
