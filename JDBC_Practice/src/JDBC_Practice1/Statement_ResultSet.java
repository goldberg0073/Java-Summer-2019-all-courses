package JDBC_Practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_ResultSet {
	
	public static void main(String[] args) throws SQLException {
		
		
		String userName ="hr";
		String passWord="hr";
		
		//// url syntax: jdbc:DataBaseType:thin:@Host:port:SID
		String url="jdbc:oracle:thin:@3.84.235.168:1521:xe";
				
		Connection connection=DriverManager.getConnection(url, userName, passWord);
		
		
		Statement statement=connection.createStatement();
		
	    ResultSet result= statement.executeQuery("Select * from employees");
	                
		
		
		
	}

}
