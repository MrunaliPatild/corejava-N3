package org.tnsif.interfacedemo;

public class User implements SBI,HDFC {

	@Override
	public String LoanType() {
		return "personal loan";
	}

	@Override
	public float getInterest() {
		return 12.8f;
	}
	

}
