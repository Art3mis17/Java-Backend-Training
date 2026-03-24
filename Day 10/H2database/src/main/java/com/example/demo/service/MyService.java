package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFound;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
	public class MyService {

    @Autowired
    private EmployeeRepository repository;

    // GET ALL
    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }

    // GET BY ID
    public Employee getEmployeeById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Employee not found with id: " + id));
    }

    // ADD
    public String addEmployee(Employee employee) {
        repository.save(employee);
        return "Employee added successfully";
    }

    // UPDATE
    public String updateEmployee(int id, Employee updatedEmployee) {
        Employee emp = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Employee not found with id: " + id));

        emp.setName(updatedEmployee.getName());
        emp.setSalary(updatedEmployee.getSalary());
        repository.save(emp);
        return "Employee updated successfully";
    }

    // DELETE BY ID
    public String deleteEmployee(int id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFound("Employee not found with id: " + id);
        }

        repository.deleteById(id);
        return "Employee deleted successfully";
    }
    
    // DELETE ALL
    public String deleteAllEmployees() {
        repository.deleteAll();
        return "All employees deleted";
    }
}
