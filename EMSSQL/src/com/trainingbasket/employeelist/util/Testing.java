/**
 * 
 */
package com.trainingbasket.employeelist.util;

import java.util.*;

/**
 * @author OpenSource
 *
 */

public class Testing {

	/**
	 * 
	 */
	public Testing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Hashtable<String, String> hashtable = new Hashtable<>();

		hashtable.put("EmployeeBasicFOrAppraisal", "12L|1year|FORD|DEVFACTORY|VERSAATA|OFFSHORE");

		String empdata = hashtable.get("EmployeeBasicFOrAppraisal");
		String empvalues[] = empdata.split("\\|");
		for (String string : empvalues) {
			System.out.println(string);
		}
	
	}
}
