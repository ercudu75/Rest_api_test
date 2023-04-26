package com.example.demo.controller;


import com.example.demo.model.Employee;

import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//handle HTTP request
@RestController
@RequestMapping("api/v1")
public class EmplyeeController {

    //localhost:9090/api/v1

    @Autowired
    private EmployeeService eService;




    //localhost:8080/employees

    @GetMapping("/employees")
    public List<Employee> getEmployees (){
        return eService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id){
     return eService.getSignleEmployee(id);
    }


    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee ){
        return eService.saveEmployee(employee);
    }

    //requestbody to recieve employee object
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id , @RequestBody Employee employee){
        employee.setId(id);
        return eService.updateEmployee(employee);

    }




    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestParam Long id){
        eService.deleteEmployee(id);

    }
}
