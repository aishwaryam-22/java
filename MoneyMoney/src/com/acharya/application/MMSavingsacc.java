package com.acharya.application;

import com.acharya.framework.Savingsacc;

public class MMSavingsacc extends Savingsacc {
    private static final float accbal=500.0f;
	public MMSavingsacc(int accno, String accnm, float accbal, boolean isSalary) {
		super(accno, accnm, accbal, isSalary);
	}
	public void withdraw(float accbal ) {
		System.out.println("Dear customer your balance is: "+ accbal);
	}
	@Override
	public String toString() {
		return "MMSavingsacc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
