package com.lti.bean;

public class Engineeer extends Employee {
	
	private String project;

	public Engineeer() {
	
	}
	public Engineeer(int eid,String ename,double salary,String project) {
		super(eid,ename,salary); //call to super class constructor
		// call to super class constructor has to be first in subclass constructor
		this.project=project;
	}
		//using super keyword we can call super class variables or method or constructor
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	@Override
	public String toString() {
		
		return super.toString()+"Project is"+project;
	}
}
	
	


