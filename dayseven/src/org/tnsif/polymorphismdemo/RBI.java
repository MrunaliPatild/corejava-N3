package org.tnsif.polymorphismdemo;
//program to demonstrate on method overriding
public class RBI {
	float getInterest()
	{
		return 10.8f;
	}
	//if we use method overriding in same class we will get error that's why we use inheritance to achieve method overriding
	/*float getInterest()
	{
		return 10.8f;
	}*/
}
