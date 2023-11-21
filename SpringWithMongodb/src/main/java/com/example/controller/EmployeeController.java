package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeSrevice;

@RestController
@RequestMapping("Employee")
public class EmployeeController {

	@Autowired
	private EmployeeSrevice employeeSrevice;

	@PostMapping
	public Employee saveData(@RequestBody Employee employee) {
		return employeeSrevice.saveData(employee);
	}

	@GetMapping
	public List<Employee> getAllEmp() {
		return employeeSrevice.getAllEmp();
	}

	@DeleteMapping("/delete/{id}")
	public String deletById(@PathVariable String id) {

		return employeeSrevice.deletById(id);
	}

	@PutMapping
	public Employee updateData(Employee employee) {

		return employeeSrevice.updateData(employee);
	}
	
	@GetMapping("/get/{id}")
	public Employee getById(@PathVariable String id) {
		return employeeSrevice.getById(id);
	}
	
}
