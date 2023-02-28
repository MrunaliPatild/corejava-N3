package org.tnsif.framework;

public abstract class NormalAcc extends ShopAcc {
	final private float delieveryCharges;
	public NormalAcc(int accno, String accnm,float charges, float delieveryCharges) {
		super(accno, accnm, charges);
		this.delieveryCharges=delieveryCharges;
	}
	@Override
	public String toString() {
		return "NormalAcc [delieveryCharges=" + delieveryCharges + "]";
	}
	public void bookProduct(float charges)
	{
		System.out.println("Acc no"+this.getAccno()+" "+"Acc name:"+this.getAccnm()+" "+"DelieveryCharges:"+(charges+delieveryCharges));
	}
	

	
	

}
