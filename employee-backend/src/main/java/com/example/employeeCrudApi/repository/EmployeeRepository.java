package com.example.employeeCrudApi.repository;

import com.example.employeeCrudApi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}

