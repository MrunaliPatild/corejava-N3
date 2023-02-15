package org.tnsif.arraysdemo;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		//int[][] a={{10,20,30},{34,56,89}}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr[0][1]);//34
		System.out.println(arr[1][1]);//78
	}

}
