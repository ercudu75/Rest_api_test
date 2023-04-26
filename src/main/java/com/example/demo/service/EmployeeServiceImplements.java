package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplements implements EmployeeService{

    @Autowired
   private EmployeeRepository eRopository;

    @Override
    public List<Employee> getEmployees() {

        return eRopository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return eRopository.save(employee);
    }

    @Override
    public Employee getSignleEmployee(Long id) {
        Optional<Employee> employee = eRopository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }
        throw new RuntimeException("Employee is not found for the id "+id);



    }

    @Override
    public  void  deleteEmployee(Long id) {
         eRopository.deleteById(id);
    }

    @Override
    public Employee updateEmployee( Employee employee) {
        return eRopository.save(employee);

    }
}
