package org.tnsif.abstractiondemo;
//program to demonstrate on abstract class and abstract method
//abstract class
public abstract class Menu {
	//abstract method
	abstract void recipe();
	abstract void foodType();
	//concrete method 
	void menuType()
	{
		System.out.println("veg and nonveg");
	}
	

}
