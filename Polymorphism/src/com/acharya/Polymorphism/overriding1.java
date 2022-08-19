package com.acharya.Polymorphism;
class Vehicle{
void run()
{
System.out.println("Vehicle is running");
}
}
public class overriding1 extends Vehicle{ 
	void run()
	{
	System.out.println("Bike is running safely");
	}
	public static void main(String[] args) {
		overriding1 obj = new overriding1();
		obj.run();

	}

}
