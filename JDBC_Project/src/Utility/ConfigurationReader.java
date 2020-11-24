package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationReader {
	
	 private static Properties configFile;
	    static {
	        try {
	        	
        // provide the path of the configuration properties 
         FileInputStream fileInputStream = new FileInputStream("configuration.properties");
        
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


	    public static void main(String[] args) {
			
	    	String url=getProperty("JDBC_URL");
	    	System.out.println(url);
	    	
	    	String username=getProperty("JDBC_UserName");
	    	System.out.println(username);
	    	
	    	String password=getProperty("JDBC_PassWord");
	    	System.out.println(password);
	    	
	    	
	    	
		}
	    
	    
}
