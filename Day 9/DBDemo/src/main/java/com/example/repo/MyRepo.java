package com.example.repo;

import com.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepo extends JpaRepository<Employee, Integer> {

}
