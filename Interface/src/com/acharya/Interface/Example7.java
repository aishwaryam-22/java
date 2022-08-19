package com.acharya.Interface;
interface Interface1
{
public void myMethod();
}
interface Interface2
{
public void myMethod();
}
public class Example7 implements Interface1, Interface2 {
	public void myMethod()
	{
	System.out.println("Implementing more than one interfaces");
	}
	public static void main(String[] args) {
		Example7 obj = new Example7();
		obj.myMethod();
	}

}
