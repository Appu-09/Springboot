package com.Springbootproject5.SpringdataCRUDoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springbootproject5.SpringdataCRUDoperations.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
