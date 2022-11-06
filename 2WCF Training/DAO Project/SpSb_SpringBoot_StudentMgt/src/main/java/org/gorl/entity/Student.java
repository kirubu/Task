package org.gorl.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stdseq")
	@SequenceGenerator(name = "stdseq", sequenceName = "stu_seq")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	public Student() 
	{
		
	}

	public Student(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Student(long id, String name, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
