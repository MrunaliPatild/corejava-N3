package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the speed and color of "+"a HondaCity");
		int speed=sc.nextInt();
		sc.nextLine();
		String color=sc.nextLine();
		HondaCity c=new HondaCity();
		HondaCity c1=new HondaCity(speed,color);
		
	}

}
