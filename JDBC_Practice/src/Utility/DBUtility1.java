package Utility;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtility1 {
	
	private final static String username = ConfigurationReader1.getProperty("JDBC_UserName1"),
				 password = ConfigurationReader1.getProperty("JDBC_PassWord1"),
				 url = ConfigurationReader1.getProperty("JDBC_URL1");
	
	private static Connection connection;
	private static Statement statement;
	
	public static DatabaseMetaData metadata;
			
	static {
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			metadata = connection.getMetaData();
		}catch(Exception e) { }
		
	}
	
	public static ResultSet getResult1(String sql) {
				// creates the result
		
		ResultSet result = null;
		
		try {
			result = statement.executeQuery(sql);
			
		}catch(Exception e) {}
		
		return result;
	}
	
	
	
	public static void tearDown() {
				// closes the connection at the last step
		try {
			connection.close();
		}catch(Exception e) { }
		
	}
	
	
	public static void UpdateQuery(String sql) {
				// INSERT, UPDATE, , DELETE, ALTER, TRUNCATE, DROP 
			
		try {
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			
		}
	}
	
	

}
