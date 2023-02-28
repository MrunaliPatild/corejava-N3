package org.tnsif.threadlifecycle;
//program to demonstrate on thread life cycle
public class Tech extends Thread{
	public void run()
	{
		System.out.println("java full stack training");
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			try {
				Thread.sleep(2000);
				
			}
			catch(InterruptedException e){
				System.out.println(e);
				
			}
		}
		System.out.println("Tech session");
		
	}

}
