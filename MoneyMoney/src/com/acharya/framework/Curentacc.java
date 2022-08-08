package com.acharya.framework;

public abstract class Curentacc extends Bankacc{
	private final float creditlimit ;
	public Curentacc(int accno, String accnm, float accbal,float creditlimit) {
		super(accno, accnm, accbal,creditlimit);
		this.creditlimit=creditlimit;
	}
	

	
public void withdraw(float creditlimit) {
	System.out.println("the withdrawable amount:"+creditlimit);
}
public float getCreditlimit() {
	return creditlimit;
}

public String ToString() {
	return "curentacc [creditlimit=" + creditlimit + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}

}
