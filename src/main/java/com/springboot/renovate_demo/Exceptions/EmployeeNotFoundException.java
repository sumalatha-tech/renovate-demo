package com.springboot.renovate_demo.Exceptions;

public class EmployeeNotFoundException extends RuntimeException{

    private String message;
    EmployeeNotFoundException(){

    }
    public EmployeeNotFoundException(String message){
        this.message= message;
    }
}
