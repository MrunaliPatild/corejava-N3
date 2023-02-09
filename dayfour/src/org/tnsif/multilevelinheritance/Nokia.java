package org.tnsif.multilevelinheritance;

public class Nokia {
	//private data members
	private int modelno;
	public void display()
	{
		System.out.println("the model no is:"+modelno);
	}
	//default constructor
	public Nokia() {
		System.out.println("Nokia class");;
		
	}
//parameterized constructor
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}
	//getters and setters
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	
	
	

}
