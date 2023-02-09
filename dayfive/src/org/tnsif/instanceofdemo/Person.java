package org.tnsif.instanceofdemo;

public class Person {
	//data members
	private String name;
	private String address;
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//default constructor
	public Person() {
		System.out.println("parent class");
		
	}
	//parameterized constructor
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	//to string
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", toString()=" + super.toString() + "]";
	}
	
	

	
	}

