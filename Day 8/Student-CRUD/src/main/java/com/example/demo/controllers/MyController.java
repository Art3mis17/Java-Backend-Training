package com.example.demo.controllers;


import com.example.demo.Entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    private final List<Employee> emp = new ArrayList<>();

    public MyController(){
        emp.add(new Employee(101, "Ravi", 25, 10000, "Developer"));
        emp.add(new Employee(102, "Raju", 30, 20000, "Tester"));
        emp.add(new Employee(103, "Ramesh", 35, 30000, "Manager"));
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return emp;
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable int id){
        for(Employee e : emp){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee e) {
        emp.add(e);
        return "Employee added successfully";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String delEmployee(@PathVariable int id){
        for (Employee e : emp){
            if(e.getId() == id){
                emp.remove(e);
                return "Employee with ID: " + id +" deleted successfully";
            }
        }
        return "Employee with id: " + id + " not found!";
    }

    @PutMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee e){
        for(Employee emp : emp){
            if(emp.getId() == id){
                emp.setName(e.getName());
                emp.setAge(e.getAge());
                emp.setSalary(e.getSalary());
                emp.setDesig(e.getDesig());
                return "Employee with ID: " + id + " updated successfully";
            }
        }
        return "Employee with id: " + id + " not found!";
    }

}
