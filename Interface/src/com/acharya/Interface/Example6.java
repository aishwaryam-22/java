package com.acharya.Interface;
interface Sayable{
default void say(){
System.out.println("Hello, this is default method");
}
void sayMore(String msg);
}
public class Example6 implements Sayable{
	public void sayMore(String msg){
		System.out.println(msg);
		}
	public static void main(String[] args) {
		Example6 dm = new Example6();
		dm.say();
		dm.sayMore("Work is worship");

	}

}
