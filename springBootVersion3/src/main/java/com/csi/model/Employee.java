package com.csi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private int empId;

    @Size(min = 2,message = "Emp name should be atleast 2 characters")
    private String empName;

    private String empAddress;

    private Long empContactNumber;

    private Double empSalary;

    @Email(message = "Email Id should be valid")
    private String empEmailId;

    private String empPassword;
}
