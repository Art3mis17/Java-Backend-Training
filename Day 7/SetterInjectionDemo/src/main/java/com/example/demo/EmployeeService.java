package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    private Employee emp;
    public EmployeeService(){
        System.out.println("Inside employee service constructor");
    }
    @Autowired
    public void setEmp(Employee emp){
        System.out.println("Inside setEmp");
        this.emp = emp;
    }

    void display(){
        System.out.println("Employee id is " + emp.getEmpid());
        System.out.println("Employee name is " + emp.getName());
        System.out.println("Employee salary is " + emp.getSalary());
    }
}
