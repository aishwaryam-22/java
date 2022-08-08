package com.acharya.framework;

public abstract class Bankfactory {
	public abstract Savingsacc getNewSavingsacc(int accno, String accnm, float accbal, boolean isSalary);
	public abstract Curentacc getNewCurentacc(int accno, String accnm, float accbal,float creditlimit);

}
