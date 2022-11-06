package com.wipro.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection connection = null;

	public static Connection getDBConnection() {
		//write code here
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ROOT","root");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","B2021042104025","B2021042104025");
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
}
