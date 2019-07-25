package com.lti.ui;
import com.lti.bean.*;

public class Demo {

	public static void main(String[] args) {
		String empdata="";

     Employee emp=new Employee(100,"King",24000.00);
     empdata=emp.toString();
     System.out.println(empdata);
     
     emp=new Manager(101,"Raja",50000.00,"IT");
     empdata=emp.toString();
     System.out.println(empdata);            // ===================>>>>POLYMORPHISM
     
     emp=new Engineeer(102,"Amir Khan",25000.00,"Swiggy");
     empdata=emp.toString();
     System.out.println(empdata);
   
   
     
     
	}

}
