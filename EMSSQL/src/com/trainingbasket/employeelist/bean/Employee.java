package com.trainingbasket.employeelist.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is the employee bean.
 */
public class Employee {
	private int m_employeeId;
	private String m_firstName;
	private String m_lastName;
	private String m_designation;
	private Double m_contactNumber;
	private Double m_salary;
	private String m_dateOfBirth;
	private String m_dateOfJoining;

	public Employee() {

	}

	public Double getContactNumber() {
		return m_contactNumber;
	}

	public void setContactNumber(Double contactNumber) {
		m_contactNumber = contactNumber;
	}

	public String getDateOfBirth() {
		return m_dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		m_dateOfBirth = dateOfBirth;
	}

	public String getDateOfJoining() {
		return m_dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		m_dateOfJoining = dateOfJoining;
	}

	public String getDesignation() {
		return m_designation;
	}

	public void setDesignation(String designation) {
		m_designation = designation;
	}

	public int getEmployeeId() {
		return m_employeeId;
	}

	public String getFirstName() {
		return m_firstName;
	}

	public void setFirstName(String firstName) {
		m_firstName = firstName;
	}

	public String getLastName() {
		return m_lastName;
	}

	public void setLastName(String lastName) {
		m_lastName = lastName;
	}

	public Double getSalary() {
		return m_salary;
	}

	public void setSalary(Double salary) {
		m_salary = salary;
	}

	public void setEmployeeId(int EmployeeId) {
			this.m_employeeId=EmployeeId;
	}

}
