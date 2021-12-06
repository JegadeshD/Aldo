package org.emp;

public class Employee {
	public void common(String name) {
		System.out.println(name);
	}
	//arguments depends on datatype
    public void common(int id) {
    	System.out.println(id);
    }
    //arguments depends on datatype count
    public void common(int i,long phone,float salary) {
    		System.out.println(i+"\n"+phone+"\n"+salary);
}
    //arguments depends on datatype order
    public void common(char c,int pincode,String city) {
System.out.println(c+"\t"+"\t"+pincode+"\t"+"\t"+city);
	}
    public void common(String city,int pincode,char c) {
System.out.println(city+"\t"+pincode+"\t"+"\t"+c);
	}
    public static void main(String[] args) {
		Employee car = new Employee ();
				car.common(1234);
		car.common("jag");
		car.common('M', 612204, "kumbakonam");
		car.common(345, 9944335171l, 5000.50f);
		car.common("chennai", 600018, 'f');
	}
	}

