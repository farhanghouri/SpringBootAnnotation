package com.afkghouri.SpringbootAssignment;

public class Student {
	public String name;
	public int id,ssn;
	
	public Student() {}
	public Student(String name, int id, int ssn) { 
		this.name = name;
		this.id = id;
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
}
