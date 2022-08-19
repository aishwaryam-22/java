package com.acharya.Final;

public class Bike1 {
	final int speedlimit=90;
	void run()
	{
	speedlimit=400;
	}
	public static void main(String[] args) {
		Bike1 obj=new Bike1();
		obj.run();

	}

}
