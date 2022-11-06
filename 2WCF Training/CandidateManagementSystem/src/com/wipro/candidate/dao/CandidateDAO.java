package com.wipro.candidate.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.wipro.candidate.bean.CandidateBean;
import com.wipro.candidate.util.DBUtil;
import com.wipro.candidate.util.WrongDataException;


public class CandidateDAO 
{
	private DBUtil dbUtil = new DBUtil();
	private Connection con = dbUtil.getDBConn();
	public String addCandidate(CandidateBean studentBean) throws SQLException
	{
			String status="";
			try 
			{
					PreparedStatement ps = con.prepareStatement("insert into CANDIDATE_TBL values(?,?,?,?,?,?,?)");
					ps.setString(1, generateCandidateId(studentBean.getName()));
					ps.setString(2, studentBean.getName());
					ps.setInt(3, studentBean.getM1());
					ps.setInt(4, studentBean.getM2());
					ps.setInt(5, studentBean.getM3());
					ps.setString(6, studentBean.getResult());
					ps.setString(7, studentBean.getGrade());
					int result = ps.executeUpdate();
					if(result>0)
						status = "SUCCESS";
					else
						throw new WrongDataException();
			} 
			catch (WrongDataException e) 
			{
				return "FAIL";
			}
			return status;
	}
	public ArrayList<CandidateBean> getByResult(String criteria)
	{
		ArrayList<CandidateBean> list=new ArrayList<CandidateBean>();
		PreparedStatement ps = null;
		 
		//select * from CANDIDATE_TBL
		try
		{
			if(criteria.equals("ALL"))
				ps = con.prepareStatement("select * from CANDIDATE_TBL");
			if(criteria.equals("PASS"))
			{
				ps = con.prepareStatement("select * from CANDIDATE_TBL where Result = ?");
				ps.setString(1, criteria);
			}
			if(criteria.equals("FAIL"))
			{
				ps = con.prepareStatement("select * from CANDIDATE_TBL where Result = ?");
				ps.setString(1, criteria);
			}
			ResultSet rs = ps.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					CandidateBean cBean = new CandidateBean();
					cBean.setId(rs.getString(1));
					cBean.setName(rs.getString(2));
					cBean.setM1(rs.getInt(3));
					cBean.setM2(rs.getInt(4));
					cBean.setM3(rs.getInt(5));
					cBean.setResult(rs.getString(6));
					cBean.setGrade(rs.getString(7));
					list.add(cBean);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
	public String generateCandidateId (String name)
	{
		String id=name.toUpperCase().substring(0, 2);
		int cid = 0;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select CANDID_SEQ.NEXTVAL from dual");
			if(rs!=null && rs.next())
			{
				cid = rs.getInt(1);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return (id+cid);
	}
}
