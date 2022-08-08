package com.acharya.client;

import com.acharya.application.MMCurrentacc;
import com.acharya.application.MMSavingsacc;
import com.acharya.framework.Curentacc;
import com.acharya.framework.Savingsacc;

public class Client {

	public static void main(String[] args) {
		Savingsacc pa = new MMSavingsacc(674, "aishwarya", 50000, true);
		Curentacc na = new MMCurrentacc(345, "manjunath",50000,100000);
		pa.withdraw(pa.getAccbal());
		pa.toString();
		na.withdraw(na.getCreditlimit());
		na.toString();

	}

}
