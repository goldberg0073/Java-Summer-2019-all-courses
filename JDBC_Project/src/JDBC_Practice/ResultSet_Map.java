package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import Utility.DBUtility;

public class ResultSet_Map {
	
	
	public static void main(String[] args) throws SQLException {
		
	             ResultSet result= DBUtility.getResult("Select * from Employees");
		
	             Map<String, Integer>EmployeeInfo=new LinkedHashMap<>();
	             
		while(result.next()) {
			
		String firstName = result.getString("first_name");
		String lastName = result.getString("last_name");
		String fullName = firstName+" "+lastName;
		Integer Salary=result.getInt("salary");
		
		System.out.println(Salary);
		EmployeeInfo.put(fullName, Salary);
		
		
	}
         System.out.println(EmployeeInfo);
		 System.out.println(EmployeeInfo.get("Steven King")==24000);
}
}