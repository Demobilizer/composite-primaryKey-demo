package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee {

	@EmbeddedId
	private EmployeeIdentity employeeIdentity;
	
	private String name;
	
	private String emailId;
	
	private String phoneNumber;

	public EmployeeIdentity getEmployeeIdentity() {
		return employeeIdentity;
	}

	public void setEmployeeIdentity(EmployeeIdentity employeeIdentity) {
		this.employeeIdentity = employeeIdentity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeIdentity=" + employeeIdentity + ", name=" + name + ", emailId=" + emailId
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public Employee(EmployeeIdentity employeeIdentity, String name, String emailId, String phoneNumber) {
		super();
		this.employeeIdentity = employeeIdentity;
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public Employee() {
	
	}
	
	
	
}
