package com.acharya.Final;
final class Bike2 {
void run()
{
System.out.println("running");
}
}
public class TVS extends Bike2{
	void run()
	{
	System.out.println("running safely with 100kmph");
	}
	public static void main(String[] args) {
		TVS tvs= new TVS();
		tvs.run();
	}

}
