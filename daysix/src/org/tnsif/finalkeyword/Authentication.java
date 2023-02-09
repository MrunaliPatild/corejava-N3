package org.tnsif.finalkeyword;
//program to demonstrate on final class
//parent class
final public class Authentication {
	//private data members
	private String pass;
	void print() {
		System.out.println("the pass is:"+pass);
	}
	//getters and setters
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
