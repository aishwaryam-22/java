class s2{
	void m(s2 a) {
		System.out.println("method invoked");
	}
	void p() {
		m(this);
	}
}
public class Testthis4 {

	public static void main(String[] args) {
		s2 s1=new s2();
		s1.p();

	}

}
