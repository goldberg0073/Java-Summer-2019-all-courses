package JDBC_Practice;

import java.sql.ResultSet;

import Utility.DBUtility;

public class DBpractice {

	public static void main(String[] args) {
		
		
		
		   ResultSet result1=DBUtility.getResult("Select * from Employees");
		
		System.out.println(result1);
	}
	
	
}
