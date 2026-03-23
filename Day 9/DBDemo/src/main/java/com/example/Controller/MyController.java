package com.example.Controller;

import java.util.List;
import java.util.Optional;

import com.example.entity.Employee;
import com.example.repo.MyRepo;
import org.springframework.web.bind.annotation.*;


@RestController
public class MyController {


    private MyRepo repository;

    public MyController(MyRepo repository) {
        this.repository = repository;
    }


    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }


    @GetMapping("/getAllEmployee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Optional<Employee> emp = repository.findById(id);
        return emp.orElse(null);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return "Employee added successfully";
    }


    // DELETE BY ID
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Employee deleted successfully";
        }
        return "Employee not found";
    }


}
