package org.tnsif.instanceofdemo;

public class Child extends Person{
	private int age;
//getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//default constructor
	public Child() {
		super();
	
	}
//parameterized constructor
	public Child(String name,String address,int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getAge()=" + getAge() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	

	

	}


