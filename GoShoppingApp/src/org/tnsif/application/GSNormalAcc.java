package org.tnsif.application;

import org.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accno, String accnm, float charges, float delieveryCharges) {
		super(accno, accnm, charges, delieveryCharges);
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}
	
	

}
