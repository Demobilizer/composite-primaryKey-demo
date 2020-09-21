package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeIdentity implements Serializable {

	private Long employeeId;
	
	private Long companyId;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public EmployeeIdentity() {
		
	}
	
	public EmployeeIdentity(Long employeeId, Long companyId) {
		super();
		this.employeeId = employeeId;
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "EmployeeIdentity [employeeId=" + employeeId + ", companyId=" + companyId + "]";
	}
	
	
	
}
