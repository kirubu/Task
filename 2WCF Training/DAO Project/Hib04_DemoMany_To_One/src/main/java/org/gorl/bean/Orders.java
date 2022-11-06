package org.gorl.bean;

public class Orders 
{
	private int o_id, o_no;
	private String o_item;
	private Person o_person;
	
	public Orders(int o_id, int o_no, String o_item, Person o_person) 
	{
		this.o_id = o_id;
		this.o_no = o_no;
		this.o_item = o_item;
		this.o_person = o_person;
	}

	public Orders() {
		super();
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public String getO_item() {
		return o_item;
	}

	public void setO_item(String o_item) {
		this.o_item = o_item;
	}

	public Person getO_person() {
		return o_person;
	}

	public void setO_person(Person o_person) {
		this.o_person = o_person;
	}

	@Override
	public String toString() {
		return "Orders [o_id=" + o_id + ", o_no=" + o_no + ", o_item=" + o_item + "]";
	}
	
	
	
}
