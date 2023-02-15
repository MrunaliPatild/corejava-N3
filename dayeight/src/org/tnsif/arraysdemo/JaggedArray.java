package org.tnsif.arraysdemo;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][];
		//making above array jagged
		arr[0]=new int[3];//1st contain 3 column
		arr[1]=new int[2];//2nd contain 2 column
		System.out.println("enter the array element:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;i++) {
				arr[i][j]=sc.nextInt();
		}
	}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
