package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeIdentity;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmloyeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee/{companyId}")
	public Employee createEmployee(@RequestBody Employee employee, @PathVariable Long companyId) {
		
		// can fetch company by Id and put it's name or any specific fiend instead, if needed!
		EmployeeIdentity employeeIdentity = new EmployeeIdentity(1000L, companyId);
		employee.setEmployeeIdentity(employeeIdentity);
		
		employeeService.save(employee);
		return employee;
	}
}
