//this keyword can be passed as argument in the constructor call
package org.tnsif.thiskeyword;
class finance
{
	int salary;

	public finance() {
		System.out.println("parent class");
	}

	public finance(int salary) {
		this.salary = salary;
	}
	void print()
	{
		System.out.println("salary is:"+salary);
	}
}
public class ThisKeywordEx {
	public static void main(String[] args) {
		finance f=new finance();
		finance f1=new finance(86000);
		f1.print();
	

	}

}
