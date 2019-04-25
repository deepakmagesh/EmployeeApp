package com.employee.project.controller;

import java.util.List;
import com.employee.project.model.Employee;
import com.employee.project.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepository;



    @GetMapping("/employee/{lastName}")
    public List <Employee> createTweets(@PathVariable(value = "lastName") String lastName) {
        return employeeRepository.findByLastName(lastName);
    }


}

