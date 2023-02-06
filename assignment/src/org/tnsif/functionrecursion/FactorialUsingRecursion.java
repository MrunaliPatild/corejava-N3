package org.tnsif.functionrecursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
	//fun def
	static int factorial(int num)
	{
		if(num!=0)
			return num*factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		//fun call
		System.out.println("factorial of the number:"+factorial(num));
		sc.close();
		

	}

}
