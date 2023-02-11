package org.tnsif.interfacedemo;
//implementable class
public class Avenger implements Bike{

	@Override
	public void milage(int speed) {
		System.out.println("speed is:"+speed);
		
		
	}

	@Override
	public void engine() {
		System.out.println("working on petrol");
		
	}

}
