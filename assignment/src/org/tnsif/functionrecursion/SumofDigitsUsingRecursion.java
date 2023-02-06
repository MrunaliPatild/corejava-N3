package org.tnsif.functionrecursion;
import java.util.Scanner;
public class SumofDigitsUsingRecursion {
	static int sum_of_digit(int n)
	{ 
		if (n == 0)
			return 0;
		return (n % 10 + sum_of_digit(n / 10));

    }
	public static void main(String args[])
	{

    	Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int result = sum_of_digit(num);
		System.out.println("Sum of digits in "+ num +" is "+ result);
	}
}
