package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repositry.EmployeeRepopsitry;

@Service
public class EmployeeServiceImpl implements EmployeeSrevice{

	@Autowired
	private EmployeeRepopsitry employeeRepopsitry;
	
	@Override
	public Employee saveData(Employee employee) {
		return employeeRepopsitry.save(employee);
	}

	@Override
	public List<Employee> getAllEmp() {
		return employeeRepopsitry.findAll();
	}

	@Override
	public String deletById(String id) {

		 employeeRepopsitry.deleteById(id);
		 
		 return "Data deleted...!";
	}

	@Override
	public Employee updateData(Employee employee) {
		
		return employeeRepopsitry.save(employee);
	}

	@Override
	public Employee getById(String id) {
		return employeeRepopsitry.findById(id).get();
	}
	
	

}
