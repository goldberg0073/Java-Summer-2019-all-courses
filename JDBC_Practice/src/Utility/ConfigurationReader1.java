package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConfigurationReader1 {
	
	public static void main(String[] args) throws SQLException {
		
		
		
		System.out.println(getProperty("JDBC_URL1"));
		System.out.println(getProperty("JDBC_UserName1"));
		System.out.println(getProperty("JDBC_PassWord1"));
		
		
	}
	
	
	

	 private static Properties configFile;
	    static {
	        try {
	        	
       // provide the path of the configuration properties 
        FileInputStream fileInputStream = new FileInputStream("configuration1.properties");
       
        configFile = new Properties();
      // load the file 
        configFile.load(fileInputStream);
	            
	            fileInputStream.close();
	        } catch (IOException e) {
	           
	        }
	    }
	    
	    // to read the file 
	    public static String getProperty(String key) {
	        return configFile.getProperty(key);
	    }


}
