package com.springboot.renovate_demo.Repository;

import com.springboot.renovate_demo.Dto.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Component
public class EmployeeRepository {

    public List<Employee> getAllEmployees(){
       return new ArrayList<>(Arrays.asList(
               Employee.builder().id("id1").firstName("abc")
                       .lastName("xyz").build(),
               Employee.builder().id("id2").firstName("test").lastName("testlastName").build()));

    }

    public Employee getEmployee(String id){
       return getAllEmployees().stream().filter(x->x.getId().equals(id)).findAny().get();
    }
}
