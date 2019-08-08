package com.uniajc.sergio.apirestfultest.repositories;

import com.uniajc.sergio.apirestfultest.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}