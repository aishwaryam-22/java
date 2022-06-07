package classesandobj2;
class Student{
	int rollno;
	String name;
	void insertrecord(int r,String n) {
		rollno=r;
		name=n;
	}
	void displayinfo() {
		System.out.println(rollno+" "+name);
	}
}
public class Main {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.insertrecord(26, "john");
        s2.insertrecord(2, "abhi");
        s1.displayinfo();
        s2.displayinfo();
	}

}
