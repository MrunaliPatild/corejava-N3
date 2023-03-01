package org.tnsif.annotations;

import java.util.Scanner;

public class SupressWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//this annotation is used to remove the warnings which occured at the compile time
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(x);
	}

}
