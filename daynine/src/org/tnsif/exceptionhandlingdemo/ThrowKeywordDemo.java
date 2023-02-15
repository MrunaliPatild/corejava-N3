package org.tnsif.exceptionhandlingdemo;
//program to demonstrate on throw and throws keyword
public class ThrowKeywordDemo {
	//method definition
	//throws is used to declare an exception
	public static void donate(int age,int weight)throws Exception
	{
		if(age>18 && weight>50)
			System.out.println("eligible to donate the blood");
		else
			throw new Exception("not eligible");
	}

	public static void main(String[] args) {
		try
		{
			//method call
			donate(17,55);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
