package com.wipro.candidate.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.wipro.candidate.bean.CandidateBean;
import com.wipro.candidate.dao.CandidateDAO;
import com.wipro.candidate.util.WrongDataException;
public class CandidateMain 
{
	public String addCandidate(CandidateBean studBean)
	{
		String result = "";
		try
		{
			if(studBean == null)
				throw new WrongDataException();
			if(studBean.getName()=="" || studBean.getName().length()<2 || studBean.getName().isEmpty())
				throw new WrongDataException();
			else
			{
				String id = new CandidateDAO().generateCandidateId(studBean.getName());
				if(id!=null)
					studBean.setId(id);
			}
			
			if(studBean.getM1()<=0 || studBean.getM1()>100 || studBean.getM2()<=0 || studBean.getM2()>100 || studBean.getM3()<=0 || studBean.getM3()>100)
				throw new WrongDataException();
			else
			{
				int tot = studBean.getM1()+studBean.getM2()+studBean.getM3();
				if(tot>=240)
				{
					studBean.setResult("PASS");
					studBean.setGrade("Distinction");
				}
				else if(tot>=180 && tot<240)
				{
					studBean.setResult("PASS");
					studBean.setGrade("First Class");
				}
				else if(tot>=150 && tot<180)
				{
					studBean.setResult("PASS");
					studBean.setGrade("Second Class");
				}
				else if(tot>=105 && tot<150)
				{
					studBean.setResult("PASS");
					studBean.setGrade("Third Class");
				}
				else
				{
					studBean.setResult("FAIL");
					studBean.setGrade("No Grade");
				}
				result = new CandidateDAO().addCandidate(studBean);
				if(result.equals("SUCCESS"))
					result = studBean.getId()+":"+studBean.getResult();
				else
					result = "Error";
			}
		}
		catch (Exception e) 
		{
			return "Data Incorrect";
		} 
		
			return result;
	}
	public ArrayList<CandidateBean> displayAll(String criteria)
	{
		ArrayList<CandidateBean> result = null;
		try
		{
			if(criteria.equals("ALL") || criteria.equals("FAIL") || criteria.equals("PASS"))
			{
				result = new CandidateDAO().getByResult(criteria);
			}
			else
				throw new WrongDataException();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		try
		{
			CandidateMain candidateMain = new CandidateMain();
			String result = candidateMain.addCandidate(null);//new CandidateBean());
			System.out.println(result);
			
			CandidateBean cbean = new CandidateBean();
			cbean.setName("");cbean.setM1(-56);cbean.setM2(500);cbean.setM3(63);
			candidateMain.addCandidate(cbean);
			
			cbean.setName("K");cbean.setM1(56);cbean.setM2(89);cbean.setM3(55);
			candidateMain.addCandidate(cbean);
			
			cbean.setName("Karma");cbean.setM1(16);cbean.setM2(29);cbean.setM3(15);
			candidateMain.addCandidate(cbean);
			
			cbean.setName("Yogi");cbean.setM1(66);cbean.setM2(92);cbean.setM3(85);
			candidateMain.addCandidate(cbean);
			
			if(cbean.getResult().trim()!="")
			{
				ArrayList<CandidateBean> records = candidateMain.displayAll(cbean.getResult());
				records = candidateMain.displayAll("ALL");
				records = candidateMain.displayAll("FAIL");
				records = candidateMain.displayAll("PASS");
				if(records.size()>0)
				{
					for(CandidateBean temp:records)
						System.out.println(temp.getId()+":"+temp.getResult());
				}
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
