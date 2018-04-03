package com.trainingbasket.employeelist.dao;

public class DAOConstants {
	public static final String connectionUrlBase = "jdbc:sqlserver://localhost:1433;";
	public static final String databaseName = "databaseName=Employee;";
	public static final String user = "user=sa;";
	public static final String password = "password=pass@123;";
	public static final String sqlDriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String singleQuote = "'";
	public static final String comma = ",";
	/**
	 * This is primarily used to initiate an insert process for Employee Table
	 */
	public static final String insertForEmployee = "INSERT INTO [dbo].[Employee]";
	public static final String selectAllEmployees = "select * from dbo.Employee";
}
