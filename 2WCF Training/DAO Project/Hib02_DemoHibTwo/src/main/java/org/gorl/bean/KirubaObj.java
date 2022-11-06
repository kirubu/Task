package org.gorl.bean;

public class KirubaObj 
{
	private int kid;
	private String name;
	private String gender;
	public KirubaObj(int kid, String name, String gender) 
	{
		
		this.kid = kid;
		this.name = name;
		this.gender = gender;
	}
	public KirubaObj( String name, String gender) 
	{
		
		this.name = name;
		this.gender = gender;
	}
	public KirubaObj() {	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		
		return "values "+this.kid+", "+this.name+", "+this.gender;
	}
	
	
}
