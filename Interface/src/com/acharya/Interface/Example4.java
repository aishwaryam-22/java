package com.acharya.Interface;
interface Vehicle{
void Engine();
}
interface Bike extends Vehicle{
void getMileage();
}
class R15 implements Bike{
public void Engine(){
System.out.println("Liquid-cooled SOHC 4-valve fuel-injected engine");
}
public void getMileage(){
System.out.println("Mileage is 40 Km/L");
}
}
public class Example4 {

	public static void main(String[] args) {
		R15 bike = new R15();
		bike.getMileage();
		bike.Engine();
	}

}
