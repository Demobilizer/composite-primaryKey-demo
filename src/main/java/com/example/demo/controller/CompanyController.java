package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;

@RestController
@RequestMapping("/api")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/company/{companyId}")
	public Company getCompanyById(@PathVariable Long companyId) {
		return companyService.findByCompanyId(companyId);
	}
}
