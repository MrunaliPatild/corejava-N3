package org.tnsif.finalkeyword;

public class Pineapple extends Cake{
	private int price;
	//getters and setters
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//if any method is declared as final in parent class then we cannot override that method in child class but we can overload it
	/*void display() {
		System.out.println();
	}*/
	final void display(int price)
	{
		System.out.println("the price is:"+price);
	}
	

}
