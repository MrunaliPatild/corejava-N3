package org.tnsif.staticdemo;

public class StaticMethod {
	//data members
	private static double salary=45000.68;
	//static method
	public static void display()
	{
		System.out.println("salary is:"+salary);
	}
	//getters and setters
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
