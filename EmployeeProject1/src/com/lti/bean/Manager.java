package com.lti.bean;

public class Manager extends Employee {
private String department;

	public Manager() {
		
	
	}
public Manager(int eid,String ename,double salary,String department) {
		super.setEid(eid);   //super class method call
		setEname(ename);
		super.salary=salary;   //super class variable
		this.department=department;
		
		//using super keyword we can call super class variables or method or constructor
	}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

	

}
