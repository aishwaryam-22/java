package i1;

public class Hybridinheritance {

	public static void main(String[] args) {
    Result obj=new Result();
    obj.display();
	}
}
class student
{
	int roll=100;
	int practical=50;
}
class exam extends student{

	int theory=100;
	int pm=theory+practical;

}
interface Project{
	int pmark=200;
	void display();
}
class Result extends exam implements Project{
	int sum = pm+Project.pmark;
	public void display()
	{
		System.out.println("roll="+roll);
		System.out.println("theory="+theory);
		System.out.println("practical="+practical);
		System.out.println("Project="+Project.pmark);
		System.out.println("totalmarks="+sum);
		
	}
		
	}