package com.acharya.application;

import com.acharya.framework.Bankfactory;
import com.acharya.framework.Curentacc;
import com.acharya.framework.Savingsacc;

public class MMBankfactory extends Bankfactory{

	@Override
	public Savingsacc getNewSavingsacc(int Accno, String accnm, float accbal, boolean isSalary) {
		MMSavingsacc mmsave = new MMSavingsacc(Accno, accnm, accbal, isSalary);
		return mmsave;
	}

	@Override
	public Curentacc getNewCurentacc(int accno, String accnm, float accbal, float creditlimit) {
		MMCurrentacc mmcurrent = new MMCurrentacc(accno, accnm, creditlimit, creditlimit);
		return mmcurrent;
	}

}
