package org.tnsif.arraysdemo;
import java.util.Scanner;
public class ArrayObjectDemo {

	public static void main(String[] args) {
		Student arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of element"+"in the array");
		int n=sc.nextInt();
		arr=new Student[n];
		/*for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					
				}
			}
			
		}*/
		int i=0;
		while(i<n)
		{
			arr[i]=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
			i++;
		}
		for(int j=0;j<n;j++) {
			System.out.println(arr[j].getRoll_no()+" "+arr[j].getName()+" "+arr[j].getPercentage());
		}
		
		

	}

}
