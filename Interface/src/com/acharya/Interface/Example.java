package com.acharya.Interface;
interface Inf1
{
public void method1();
}
public class Example implements Inf1 {
	public void method1()
	{
	System.out.println("method1");
	}
	public static void main(String[] args) {
		Example obj = new Example();
		obj.method1();
	}

}
