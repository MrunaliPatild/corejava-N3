package org.tnsif.annotations;
class Parent
{
	public void print() {
		System.out.println("parent class method");
	}
}
class Child extends Parent
{
	@Override
	public void print()
	{
		super.print();
		System.out.println("child class method");
	}
}
public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		Child p=new Child();
		p.print();
		

	}

}
