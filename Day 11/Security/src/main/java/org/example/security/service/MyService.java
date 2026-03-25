package org.example.security.service;


import org.example.security.entity.Employee;
import org.example.security.exception.ResourceNotFoundException;
import org.example.security.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployee(){
        return repository.findAll();
    }

    public Employee getEmployeeById(int id){
        return repository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
    }

    public String addEmployee(Employee employee){
        repository.save(employee);
        return "Employee added successfully";
    }

    public String updateEmployee(int id, Employee updatedEmployee) {
        Employee emp = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        emp.setName(updatedEmployee.getName());
        emp.setSalary(updatedEmployee.getSalary());
        repository.save(emp);
        return "Employee updated successfully";
    }

    public String deleteEmployee(int id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Employee not found with id: " + id);
        }

        repository.deleteById(id);
        return "Employee deleted successfully";
    }

    public String deleteAllEmployees() {
        repository.deleteAll();
        return "All employees deleted";
    }


}
