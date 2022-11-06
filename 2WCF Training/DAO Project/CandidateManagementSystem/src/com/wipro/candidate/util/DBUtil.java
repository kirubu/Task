package com.wipro.candidate.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil 
{
	
	public Connection getDBConn() 
	{
		Connection con = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ROOT","root");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","B2021042104025","B2021042104025");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//write code here
		return con;
	}
}
