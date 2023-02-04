package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the song number");
		int songno=sc.nextInt();
		switch (songno)
		{
		case 1:
			System.out.println("Kesariya");
		break;
		case 2:
			System.out.println("Ved");
		break;
		case 3:
			System.out.println("Calm down");
		break;
		default:
			System.out.println("invalid input");
			
		
			
		}

	}

}
