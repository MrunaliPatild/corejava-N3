package org.tnsif.multithreading;

public class SynchronisationDemo {
	synchronized void print(int num) throws InterruptedException{
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
		}
	}
}
//thread 1
class ThreadOne extends Thread
{
	SynchronisationDemo d;
	//parameterized constructor

	public ThreadOne(SynchronisationDemo d) {
		super();
		this.d = d;
	}
	public void run() {
		try {
			d.print(10);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
//thread 2
class ThreadTwo extends Thread{
	SynchronisationDemo d;
	public ThreadTwo(SynchronisationDemo d) {
		super();
		this.d=d;
	}
	public void run() {
		try {
			d.print(15);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
}
