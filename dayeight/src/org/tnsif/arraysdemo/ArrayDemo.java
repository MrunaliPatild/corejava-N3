package org.tnsif.arraysdemo;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of element"+"in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		//to allocate the value to an array
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("the array element are:");
		//to print the element of an array
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		//to sort an array element
		Arrays.sort(arr);
		/*for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}*/
		System.out.println("sorted element are:");
		//enhance for loop
		for(int itr:arr) {
			System.out.println(itr+" ");
		}
		
	}

}
