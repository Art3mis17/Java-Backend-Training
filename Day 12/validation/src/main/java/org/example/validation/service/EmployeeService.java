package org.example.validation.service;


import org.example.validation.exception.ResourceNotFoundException;
import org.example.validation.entity.Employee;
import org.example.validation.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getAllEmployee(){
        return repo.findAll();
    }

    public Employee addEmployee(Employee employee){
        return repo.save(employee);
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        Employee existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        existing.setName(updatedEmployee.getName());
        existing.setSalary(updatedEmployee.getSalary());
        existing.setPhn_no(updatedEmployee.getPhn_no());
        existing.setUsername(updatedEmployee.getUsername());
        existing.setPassword(updatedEmployee.getPassword());
        return repo.save(existing);
    }

    public void deleteEmployee(int id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Employee not found with id: " + id);
        }
        repo.deleteById(id);
    }


}
