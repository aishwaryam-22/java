package com.acharya.inheritance;
class Animalss{
	void eat() {
		System.out.println("eating");
	}
}
class Dogs extends Animalss{
	void bark() {
		System.out.println("barking");
	}
}
class Cats extends Animalss{
	void meow() {
		System.out.println("meowing");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Dogs d1=new Dogs();
		Cats c1=new Cats();
		d1.bark();
		c1.meow();
		d1.eat();
		c1.eat();

	}

}
