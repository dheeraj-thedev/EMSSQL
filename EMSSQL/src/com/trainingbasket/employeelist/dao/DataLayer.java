/**
 * 
 */
package com.trainingbasket.employeelist.dao;

import javax.sql.*;


import com.trainingbasket.employeelist.bean.Employee;

import java.sql.*;
import java.util.Date;

/**
 * @author OpenSource
 *
 */
public class DataLayer {

	// Create a variable for the connection string.
	String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=Employee;user=sa;password=pass@123";

	// Declare the JDBC objects.
	Connection con = null;
	Statement stmt = null;
	int rs;

	public DataLayer() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	public int savEmployee(Employee employee) {
		try {
			// Establish the connection.
			// Create and execute an SQL statement that returns some data.
			String SQL = "INSERT INTO [dbo].[Employee]" + "           ([FirstName]" + "           ,[LastName]"
					+ "           ,[Designation]" + "           ,[ContactNumer]" + "           ,[Salary]"
					+ "           ,[DateOfBirth]" + "           ,[DateOfJoining])"
					+ "     								VALUES" + "('" + employee.getFirstName() + "','"
					+ employee.getLastName() + "','" + employee.getDesignation() + "','" + employee.getContactNumber()
					+ "','" + employee.getSalary() + "','" + employee.getDateOfBirth() + "','"
					+ employee.getDateOfJoining() + "')";

			stmt = con.createStatement();
			rs = stmt.executeUpdate(SQL);

		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}
		System.out.println(rs + "Data Has been Inserted");
		return rs;
	}
/*
	@SuppressWarnings("deprecation")
	public static void main(String... strings) {

		Employee employee = new Employee();
		employee.setFirstName("Drj");
		employee.setLastName("Sng");
		employee.setDesignation("SSE");
		
		employee.setSalary(123D);
		employee.setContactNumber(1234D);
		employee.setDateOfBirth("12-1-1989");
		employee.setDateOfJoining("12-1-1989");
		new DataLayer().savEmployee(employee);
	}*/

}
