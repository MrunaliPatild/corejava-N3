package org.tnsif.polymorphismdemo;

public class SBI extends RBI {
	//overriding method of parent class here
	float getInterest()
	{
		System.out.println(super.getInterest());
		return 12.8f;
	}

}
