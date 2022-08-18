package i1;
interface Shape
{
	static double  pi = 3.14;
	void calculate(float f1,float f2);
}
class triangle implements Shape
{
	public void calculate(float x,float y)
	{
		System.out.println(0.5*x*y);
	}
}
class rectangle implements Shape{
	public void calculate(float x,float y)
	{
		System.out.println(x*y);
	}
}
class circle implements Shape{
	public void calculate(float x,float y) {
		System.out.println(pi*x*y);
	}
}
public class Multipleinheritance {

	public static void main(String[] args) {
		Shape s1;
		triangle t1 =new triangle();
		rectangle r1=new rectangle();
		circle c1=new circle();
		s1=t1;
		s1.calculate(8, 9);
		s1=r1;
		s1.calculate(7, 21);
		s1=c1;
		s1.calculate(4,4);
	
	}
}
