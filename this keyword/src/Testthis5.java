class B{
	a4 obj;
	B(a4 obj){
		this.obj=obj;
	}
	void display() {
		System.out.println(obj.data);
	}
}
class a4{
	int data=10;
	a4(){
		B b=new B(this);
		b.display();
	}
}
public class Testthis5 {

	public static void main(String[] args) {
		a4 a=new a4();

	}

}
