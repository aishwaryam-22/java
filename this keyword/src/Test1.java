
public class Test1 {
	void m()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		Test1 obj=new Test1();
		System.out.println(obj);
		obj.m();

	}

}
