package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Company;

public interface CompanyService {

	public Company findByCompanyId(Long companyId);

}
