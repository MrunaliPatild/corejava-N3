package org.tnsif.looping;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(i+" ");
		System.out.println();
		for(int i=n;i>=1;i--)
			System.out.print(i+" ");

	}

}
