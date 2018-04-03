/**
 * 
 */
package com.trainingbasket.employeelist.dao;

import com.trainingbasket.employeelist.bean.Employee;
import com.trainingbasket.employeelist.dao.DAOConstants;
import java.sql.*;
import java.util.List;

/**
 * @author OpenSource
 *
 */
public class DataLayer {
	String connectionUrl = DAOConstants.connectionUrlBase + DAOConstants.databaseName + DAOConstants.user
			+ DAOConstants.password;
	Connection sqlConnection = null;
	Statement sqlStatement = null;
	ResultSet resultSet = null;
	int insertResult;

	public DataLayer() {
		try {
			Class.forName(DAOConstants.sqlDriverName);
			sqlConnection = DriverManager.getConnection(connectionUrl);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	public int savEmployee(Employee employee) {
		try {
			String SQL = DAOConstants.insertForEmployee + "VALUES" + "('" + employee.getFirstName() + "','"
					+ employee.getLastName() + "','" + employee.getDesignation() + "','" + employee.getContactNumber()
					+ "','" + employee.getSalary() + "','" + employee.getDateOfBirth() + "','"
					+ employee.getDateOfJoining() + "')";
			sqlStatement = sqlConnection.createStatement();
			insertResult = sqlStatement.executeUpdate(SQL);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlStatement != null)
				try {
					sqlStatement.close();
				} catch (Exception e) {
				}
			if (sqlConnection != null)
				try {
					sqlConnection.close();
				} catch (Exception e) {
				}
		}
		System.out.println(insertResult + "Row Was Inserted Successfully");
		return insertResult;
	}

	/*public List<Employee> getAllEmployess() {
		try {
			Employee employee = new Employee();
			sqlStatement = sqlConnection.createStatement();
			resultSet = sqlStatement.executeQuery(DAOConstants.selectAllEmployees);
			while (resultSet.next()) {
				employee.setEmployeeId((Integer)resultSet.getString("EmployeeID"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlStatement != null)
				try {
					sqlStatement.close();
				} catch (Exception e) {
				}
			if (sqlConnection != null)
				try {
					sqlConnection.close();
				} catch (Exception e) {
				}
		}
		System.out.println(insertResult + "Row Was Inserted Successfully");
		return insertResult;
	}
*/}
