package com.syed.springbootreact.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syed.springbootreact.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}

