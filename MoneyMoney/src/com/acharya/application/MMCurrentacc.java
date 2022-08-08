package com.acharya.application;

import com.acharya.framework.Curentacc;

public class MMCurrentacc extends Curentacc {
	public MMCurrentacc(int accno, String accnm, float accbal,float creditlimit) {
		super(accno, accnm, accbal,creditlimit);
		
	}

	public void withdraw(float creditlimit) {
		System.out.println("Dear Customer,Your balance:" + getAccbal() + 
				 " and limit is:" + creditlimit);
	}

	@Override
	public String toString() {
		return "MMSavingsacc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
