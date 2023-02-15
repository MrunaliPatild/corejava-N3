package org.tnsif.exceptionhandlingdemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		int arr[]=new int[] {101,23,45};
		try {
			System.out.println("exception handled:");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("exception handled:");
		}
		finally {
			System.out.println("finally block");
		}

	}

}
