package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println("a is greater than b");
		else
			System.out.println("a is not greater than b");
		

	}

}
