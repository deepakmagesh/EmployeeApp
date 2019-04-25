package com.employee.project.repo;

import com.employee.project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository <Employee,String> {

    List <Employee> findByLastName(String lastName);
}
