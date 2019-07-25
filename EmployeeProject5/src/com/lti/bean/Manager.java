package com.lti.bean;

public class Manager extends Employee {
private String department;

	public Manager() {
		
	
	}
public Manager(int eid,String ename,double salary,String department) {
		super(eid,ename,salary); //call to super class constructor (added by compiler implicitlynor automatically)
		// call to super class constructor has to be first in subclass constructor
		this.department=department;
		//using super keyword we can call super class variables or method or constructor
	}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Department is"+department;
	}

	

}
