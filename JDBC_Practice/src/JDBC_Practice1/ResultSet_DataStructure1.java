package JDBC_Practice1;

import java.sql.ResultSet;
import java.sql.SQLException;

import Utility.DBUtility1;

public class ResultSet_DataStructure1 {

	
	
	public static void main(String[] args) throws SQLException {
		
	ResultSet result=DBUtility1.getResult1("Select * from Employees");
	
	
		
	while(result.next()) {
		
		String firstName=result.getString("first_name");
	System.out.println(firstName);
		
	}
	
	
	}
	
	
}
