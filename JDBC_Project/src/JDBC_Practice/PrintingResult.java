package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintingResult {
	
	
	public static void main(String[] args) throws SQLException {
		
		//connection
		String userName ="hr";
		String passWord="hr";
		
		//// url syntax: jdbc:DataBaseType:thin:@Host:port:SID
		String url="jdbc:oracle:thin:@3.84.235.168:1521:xe";
				
		Connection connection=DriverManager.getConnection(url, userName, passWord);
		
		//Statement
		Statement statement =connection.createStatement();
	
		
		//result
          ResultSet   result=statement.executeQuery("Select * from employees");
        
		while(result.next()) {
		//	String firstName=result.getString("first_name");
		
			String firstName=result.getString(2);
			//System.out.println(firstName);
			String lastName=result.getString(3);
		//	System.out.println(lastName);
			
			
			int salary=result.getInt("salary");
			System.out.println("Employess :"+ firstName+"  "+lastName+" $"+salary);
			
			
		}
//		String sql = "Update developers set name = ‘Erhan’ where name = ‘Madina’";
//		statement.executeUpdate(sql);
//		
	}

}
