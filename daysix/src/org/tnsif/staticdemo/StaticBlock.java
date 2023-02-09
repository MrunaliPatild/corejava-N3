package org.tnsif.staticdemo;

public class StaticBlock {
	//non-static variable
	private int num;
	//static variable
	private static String name;
	//getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}

	//static block is used to initialized static variable
	static {
		name="Mrunali";
	}

}
