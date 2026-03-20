package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee{
    private int empid;
    private String name;
    private double salary;

    // Constructor
    public Employee(
            @Value("101") int empid,
            @Value("Ravi") String name,
            @Value("10000") double salary) {
        System.out.println("Inside employee constructor");
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEmpId() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public double getSalary(){
        return salary;
    }
}
