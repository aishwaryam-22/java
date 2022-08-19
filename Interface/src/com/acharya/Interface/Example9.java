package com.acharya.Interface;
interface Writeable{
void writes();
}
interface Readable {
void reads();
}
public class Example9 implements Readable,Writeable{
	public void reads() {
		System.out.println("Student reads ");
		}
		public void writes(){
		System.out.println("Student writes");
		}
	public static void main(String[] args) {
		Example9 s = new Example9();
		s.reads();
		s.writes();
	}

}
