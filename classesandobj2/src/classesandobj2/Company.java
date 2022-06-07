package classesandobj2;

public class Company {
	String name;

	public static void main(String[] args) {
		Company c1=new Company();
		c1.name="bob";
		Company c2=c1;
		c1=null;
		System.out.println(c2.name);
		Company c3=new Company();
		c3.name="john";
		System.out.println(c3.name);

	}

}
