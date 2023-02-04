package org.tnsif.looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=1;
		while(n>=i)
		{
			System.out.print(n+" ");
			n--;
		}

	}

}
