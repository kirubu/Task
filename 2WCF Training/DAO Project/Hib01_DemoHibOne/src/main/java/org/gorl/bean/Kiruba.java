package org.gorl.bean;

public class Kiruba 
{
	private int kid;
	private String kname,kgender;
	public Kiruba(int kid, String kname, String kgender) {
		super();
		this.kid = kid;
		this.kname = kname;
		this.kgender = kgender;
	}
	public Kiruba() 
	{
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getKgender() {
		return kgender;
	}
	public void setKgender(String kgender) {
		this.kgender = kgender;
	}
	@Override
	public String toString() {

		return "Values "+this.kid+" "+this.kname+" "+this.kgender+" inserted";
	}
	
}
