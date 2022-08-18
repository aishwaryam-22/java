
public class Student2 {
	int rollno;
    String name;
    static String college="acharya";
Student2(int r,String n){
	rollno=r;
	name=n;
}
static void change() {
	college="AIT";
}
void display() {
	System.out.println(rollno+" "+name+" "+college);
}

	public static void main(String[] args) {
		Student2 s1=new Student2(45,"karan");
		Student2 s2=new Student2(12,"arjun");
		change();
		s1.display();
		s2.display();

	}

}
