package org.tnsif.superkeyword;
//parent class
public class Flower {
	private String name;
//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//default constructor
	public Flower() {
		System.out.println("flower parent class");
		
	}
//parameterized constructor
	public Flower(String name) {
		super();
		this.name = name;
	}
	
	
}


