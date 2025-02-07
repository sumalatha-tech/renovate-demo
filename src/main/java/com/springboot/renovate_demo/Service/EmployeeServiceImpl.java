package com.springboot.renovate_demo.Service;
import com.springboot.renovate_demo.Dto.Employee;
import com.springboot.renovate_demo.Exceptions.EmployeeNotFoundException;
import com.springboot.renovate_demo.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Employee getEmployee(String id) {
     try{
         return employeeRepository.getEmployee(id);
     } catch (NoSuchElementException e) {
         throw new EmployeeNotFoundException("No Employee Found with Id: "+id);
     }

    }
}
