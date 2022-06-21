package com.acharya.inheritance;
class Animals{
	void eat() {
		System.out.println("eating...");
	}
}
class Dogg extends Animals{
	void bark() {
		System.out.println("barking");
	}
}
class Pup extends Dogg{
	void weep() {
		System.out.println("weeping");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Pup a=new Pup();
		a.weep();
		a.bark();
		a.eat();

	}

}
