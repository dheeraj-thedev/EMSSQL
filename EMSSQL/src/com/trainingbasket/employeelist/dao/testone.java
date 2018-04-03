package com.trainingbasket.employeelist.dao;

import com.trainingbasket.employeelist.bean.Employee;

public class testone {

	public static void main(String... name) {
		Employee employee = new Employee();
		String data = "('" + employee.getFirstName() + "','" + employee.getLastName() + "','"
				+ employee.getDesignation() + "','" + employee.getContactNumber() + "','" + employee.getSalary() + "','"
				+ employee.getDateOfBirth() + "','" + employee.getDateOfJoining() + "')";

		System.err.println(data);
	}
}
