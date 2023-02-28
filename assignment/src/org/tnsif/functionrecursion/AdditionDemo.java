 package org.tnsif.functionrecursion;

import java.util.Scanner;

public class AdditionDemo {
	//function definition
	/*static int addition(int x, int y) {
		int sum=x+y;
		return sum;
		
		
	}*/
	//function definition
	static void addition(int x,int y)
	{
		int sum=x+y;
		System.out.println("the sum is:"+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//function call
		addition(x,y);
		sc.close();
		//System.out.println(addition(x,y));
		
		
		
		

	}

}
