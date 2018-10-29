package com.gradle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.gradle.model.Employee;
@Transactional(rollbackFor=Exception.class)
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
