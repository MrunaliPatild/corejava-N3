//this keyword is used to refer instance variable of current class
package org.tnsif.thiskeyword;
class Account{
	int a;
	int b;
	public void setdata(int a,int b) {
		//a=a1;
		//b=b1;
		this.a=a;
		this.b=b;
	}
	public void showdata() {
		System.out.println("value of A="+a);
		System.out.println("value of B="+b);
	}
}
public class ThisKeywordDemo {
	public static void main(String[] args) {
		Account obj=new Account();
		obj.setdata(4, 9);
		obj.showdata();

	}

}
