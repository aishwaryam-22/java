class demo{
	demo(){
		System.out.println("hello a");
	}
	demo(int x){
		this();
		System.out.println(x);
	}
}
public class Testthis2 {

	public static void main(String[] args) {
		demo a=new demo(10);

	}

}
