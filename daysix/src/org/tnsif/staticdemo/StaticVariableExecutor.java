package org.tnsif.staticdemo;
//driver class
public class StaticVariableExecutor {

	public static void main(String[] args) {
		StaticVariable s=new StaticVariable("Nia Lopez");
		System.out.println(s);
		//use classname.varname to print static variable
		System.out.println(StaticVariable.companyName);

	}

}
