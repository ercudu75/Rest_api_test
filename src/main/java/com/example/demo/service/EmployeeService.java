package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee saveEmployee(Employee employee);

    Employee getSignleEmployee(Long id);

    void deleteEmployee(Long id);

    Employee updateEmployee( Employee employee);



}
