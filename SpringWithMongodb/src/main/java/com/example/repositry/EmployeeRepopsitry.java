package com.example.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Employee;

public interface EmployeeRepopsitry extends MongoRepository<Employee, String>{

}
