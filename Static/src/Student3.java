
public class Student3 {
	int rollno;
    String name;
    static String college;
    static {
    	college="acharya";
    }
Student3(int r,String n){
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
		Student3 s1=new Student3(45,"karan");
		Student3 s2=new Student3(12,"arjun");
		change();
		s1.display();
		s2.display();
	}

}
