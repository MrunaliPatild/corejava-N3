package org.tnsif.multilevelinheritance;
import java.util.Scanner;
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the modelno,version and slottype");
		int modelno=sc.nextInt();
		sc.nextLine();
		String version=sc.nextLine();
		String slottype=sc.nextLine();
		Iphone i=new Iphone();
		Iphone i1=new Iphone(modelno,version,slottype);
		i1.setModelno(modelno);
		i1.setVersion(version);
		i1.setSlottype(slottype);
		System.out.println(i1);

	}

}
