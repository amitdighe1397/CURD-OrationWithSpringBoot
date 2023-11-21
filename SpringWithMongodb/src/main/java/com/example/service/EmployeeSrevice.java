package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeSrevice {
	
	public Employee saveData(Employee employee);
	
	public List<Employee> getAllEmp();
	
	public String deletById(String id);
	
	public Employee updateData(Employee employee);
	
	public Employee getById(String id);
	

}
