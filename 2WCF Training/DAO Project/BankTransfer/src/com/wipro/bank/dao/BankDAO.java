package com.wipro.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.util.DBUtil;

public class BankDAO {
	
	private Connection con = DBUtil.getDBConnection();
	
	public boolean validateAccount(String accountNumber) 
	{
		boolean validAccountStatus = false;
		String accNum = "";
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Account_Number from ACCOUNT_TBL");
			while(rs!=null && rs.next())
			{
				if(accountNumber.equals(rs.getString(1)))
					validAccountStatus = true;
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return validAccountStatus;
	}

	public float findBalance(String accountNumber) 
	{
		float balance = 0f;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Balance from ACCOUNT_TBL where Account_Number = '"+accountNumber+"'");
			if(rs!=null && rs.next())
				balance = rs.getFloat(1);
			else
				return -1;
			return balance;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return balance;
	}

	public boolean updateBalance(String accountNumber, float newBalance)
	{
		boolean status = false;
		try 
		{
			Statement stmt = con.createStatement();
			int res = stmt.executeUpdate("update ACCOUNT_TBL set Balance = '"+newBalance+"'"+"where Account_Number = '"+accountNumber+"'");
			if(res>0)
				status = true;
			else
				return status;
			return status;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return status;
	}

	public boolean transferMoney(TransferBean transferBean) 
	{
		boolean transferStatus = false;
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into TRANSFER_TBL values(?,?,?,?,?)");
			ps.setInt(1, generateSequenceNumber());
			ps.setString(2, transferBean.getToAccountNumber());
			ps.setString(3, transferBean.getFromAccountNumber());
			Date date = new java.util.Date();
			ps.setDate(4, new java.sql.Date(date.getTime()));
			ps.setFloat(5, transferBean.getAmount());
			int res = ps.executeUpdate();
			if(res>0)
				transferStatus = true;
			else
				return transferStatus;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return transferStatus;
	}

	public int generateSequenceNumber() 
	{
		int id = -1;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select transactionId_seq.nextval from dual");
			while (rs!= null && rs.next())
				id = rs.getInt(1);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return id;
	}

}
