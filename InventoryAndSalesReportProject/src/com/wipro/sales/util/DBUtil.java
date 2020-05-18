package com.wipro.sales.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBUtil {
	private static Connection con = null;
	public static Connection getDBConnection(){
		try{
			Class.forName("oracle.jdbc.driver.oracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521")
					if(con!=null)
					{
						return con;
					}
					else
						return 
		
		}
		
		
		return null;
	}

}
