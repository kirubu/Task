package com.wipro.hms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.wipro.hms.bean.RentalPropertyBean;
import com.wipro.hms.util.DBUtil;



public class RentalPropertyDAO 
{
	
	private Connection con = DBUtil.getDBConnection();
	
	public String generatePropertyID(String city) 
	{
		String name = city.substring(0,3).toUpperCase();
		int id=0;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select RENTAL_SEQ.nextval from dual");
			while (rs!= null && rs.next())
				id = rs.getInt(1);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		return name+String.valueOf(id);
	}

	public int createRentalProperty(RentalPropertyBean bean) 
	{
		int result = 1;
		try {
			PreparedStatement ps = con.prepareStatement("insert into RENTAL_TBL values(?,?,?,?,?)");
			ps.setString(1, generatePropertyID(bean.getCity()));
			ps.setFloat(2, bean.getRentalAmount());
			ps.setInt(3, bean.getNoOfBedRooms());
			ps.setString(4, bean.getLocation());
			ps.setString(5, bean.getCity());
			result = ps.executeUpdate();
		}
		catch (Exception e) {
				return -1;
		}
		return result;
	}
	
	
}
