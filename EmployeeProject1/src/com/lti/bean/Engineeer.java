package com.lti.bean;

public class Engineeer extends Employee {
	
	private String project;

	public Engineeer() {
	
	}
	public Engineeer(int eid,String ename,double salary,String project) {
		super.setEid(eid);   //super class method call
		setEname(ename);
		super.salary=salary;   //super class variable
		this.project=project;
		//using super keyword we can call super class variables or method or constructor
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
	

}
