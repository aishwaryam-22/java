package com.acharya.framework;

public abstract class Bankacc {
	private int accno;
	private String accnm;
	private float accbal;
	public Bankacc(int accno,String accnm,float accbal,float creditlimit) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.accbal = accbal;
	}
public void withdraw(float accbal) {
	System.out.println("the amount withdrawn is"+accbal);
	
}
public void deposit(float accbal) {
	System.out.println("the amount deposited is"+accbal);
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getAccnm() {
	return accnm;
}
public void setAccnm(String accnm) {
	this.accnm = accnm;
}
public float getAccbal() {
	return accbal;
}
public void setAccbal(float accbal) {
	this.accbal = accbal;
}
@Override
public String toString() {
	return "Bankcc [accno=" + accno + ", accnm=" + accnm + ", accbal=" + accbal + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}
