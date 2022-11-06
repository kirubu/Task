package com.wipro.bank.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.dao.BankDAO;
import com.wipro.bank.util.InsufficientFundsException;

public class BankMain 
{
	private static BankDAO bankDAO = new BankDAO();
	private float bal;
	public static void main(String[] args) 
	{
		BankMain bankMain = new BankMain();
		System.out.println(bankMain.checkBalance("1234567890"));
		
		TransferBean transferBean = new TransferBean();
		 
		transferBean.setFromAccountNumber("1234567890");
		transferBean.setAmount(500);
		transferBean.setToAccountNumber("1234567891");
		transferBean.setDateOfTransaction(new java.util.Date());
		 
		System.out.println(bankMain.transfer(transferBean));

	}

	public String checkBalance(String accountNumber) 
	{
		
		
		boolean res = bankDAO.validateAccount(accountNumber);
		if(res)
		{
			bal = bankDAO.findBalance(accountNumber);
			return "BALANCE IS:"+bal;
		}
		else
			return "ACCOUNT NUMBER INVALID";
	}

	public String transfer(TransferBean transferBean) 
	{
		String status = "";
		if(transferBean == null)
			return "INVALID";
		if(bankDAO.validateAccount(transferBean.getFromAccountNumber()) && bankDAO.validateAccount(transferBean.getToAccountNumber()))
		{
			try
			{
				if(bankDAO.findBalance(transferBean.getFromAccountNumber())>transferBean.getAmount())
				{
					bankDAO.updateBalance(transferBean.getFromAccountNumber(), bal-transferBean.getAmount());
					float toNewBal = bankDAO.findBalance(transferBean.getToAccountNumber());
					bankDAO.updateBalance(transferBean.getToAccountNumber(), toNewBal+transferBean.getAmount());
					if(bankDAO.transferMoney(transferBean))
						status = "SUCCESS";
				}
				else
				{
					throw new InsufficientFundsException();
				}
			}
			catch (Exception e) 
			{
				return "INSUFFICIENT FUNDS";
			}
		}
		else
			return "INVALID ACCOUNT";
		return status;	
	}
}
