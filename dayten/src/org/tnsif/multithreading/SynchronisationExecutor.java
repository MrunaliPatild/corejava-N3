package org.tnsif.multithreading;
//driver class program to demonstrate synchronized method
public class SynchronisationExecutor {

	public static void main(String[] args) {
		SynchronisationDemo obj=new SynchronisationDemo();
		ThreadOne t1=new ThreadOne(obj);
		ThreadTwo t2=new ThreadTwo(obj);
		t1.start();
		t2.start();
		}
}
