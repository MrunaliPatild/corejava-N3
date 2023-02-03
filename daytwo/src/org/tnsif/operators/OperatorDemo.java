package org.tnsif.operators;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//Arithmetic operator5
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//relational operator
		boolean res=x>y;
		System.out.println(res);
		
		//assignment operator
		x*=y;//x=x*y
		System.out.println(x);
		
		//logical operator
		boolean res2=(5=5)&&(5>3);//true
		boolean res3=(5==3)||(5>2);//true
		boolean res4=!(5==4);//true
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		//bitwise operator
		int a=12 & 5;
		int b=12 | 5;
		int c=12^5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//ternary operator
		String res=(12%2==0)?"Even":"Odd";
		System.out.println(res);
		
		//increment and decrement
		int p= x++;
		int q= --x;
		System.out.println(p);
		System.out.println(q);
		
		
		
		
		

	}

}
