package com.lti.ui;
import com.lti.bean.*;

public class Demo {

	public static void main(String[] args) {
	//generating super class object
     Employee emp=new Employee(100,"King",24000.00);
     //generating subclass object
     Manager m=new Manager(101,"Raja",50000.00,"IT");
     Engineeer en=new Engineeer(102,"Amir Khan",25000.00,"Swiggy");
     
     String empdata=emp.toString();  
     System.out.println(empdata);
     String mgrdata=m.toString(); //manager is calling super class employee to string()
     System.out.println(mgrdata);
     
     String engdata=en.toString(); //engineer is calling super class employee to string()
     System.out.println(engdata);
	}

}
