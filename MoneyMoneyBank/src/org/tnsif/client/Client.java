package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Client {
	public static void main(String args[])
	{
		BankFactory b=new MMBankFactory();
		MMCurrentAcc c=new MMCurrentAcc(1100,"Mrunali",25000.0f,5.0f);
		MMSavingAcc s=new MMSavingAcc(2200,"Shraddha",2000.0f,true);
		System.out.println("Saving Account");
		System.out.println(s);
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		System.out.println(c);
		c.withdraw(c.getAccBal());
		
	}
}
