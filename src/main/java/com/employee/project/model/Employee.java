package com.employee.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "EMPLOYEE")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

        @Id
        @Column(name ="ID")
        int employeeId;
        @Column(name ="first_name")
        String firstName;
        @Column(name ="last_name")
        String lastName;
        @Column(name ="birthdate")
        Date birthDate;
    }


