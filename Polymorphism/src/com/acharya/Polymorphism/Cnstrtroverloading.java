package com.acharya.Polymorphism;

public class Cnstrtroverloading {
	int id;
	String name;
	int age;
	Cnstrtroverloading(int i,String n){
	id = i;
	name = n;
	}
	Cnstrtroverloading(int i,String n,int a){
	id = i;
	name = n;
	age=a;
	}
	void display()
	{
	System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		Cnstrtroverloading s1 = new Cnstrtroverloading(13,"Aishwarya");
		Cnstrtroverloading s2 = new Cnstrtroverloading(67,"Dev",20);
		s1.display();
		s2.display();

	}

}
