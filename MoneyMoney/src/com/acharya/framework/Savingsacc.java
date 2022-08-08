package com.acharya.framework;

public abstract class Savingsacc extends Bankacc {
	private boolean isSalary;
	
	private static final float creditlimit=0;
	
	public Savingsacc(int accno,String accnm,float accbal,boolean isSalary) {
		super(accno,accnm,accbal, accbal);
		this.isSalary=isSalary;
	}
public void withdraw(float accbal) {
	System.out.println("the account balance is:"+accbal);
}
public boolean isSalary() {
	return isSalary;
}
public static float getCreditlimit() {
	return creditlimit;
}
public void setSalary(boolean isSalary) {
	this.isSalary = isSalary;
}
@Override
public String toString() {
	return "Savingsacc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}}
