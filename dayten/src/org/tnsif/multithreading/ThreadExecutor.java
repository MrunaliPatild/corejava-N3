package org.tnsif.multithreading;

public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram p=new SimpleThreadProgram();
		p.setName("java thread");//used to change thread name
		p.setPriority(8);//used to change priority
		//when thread call to start method it will come to run method
		p.start();//we can only call start method at once
		p.run();
		System.out.println("current thread"+p);
		

	}

}
