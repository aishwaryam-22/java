class Employee2 {
int id;
String name;
float salary;

Employee2(int id, String name, float salary) {
System.out.println("user defined no-argument "+ "constructor executed");

}

void display() {
System.out.println(id + " " + name + " " + salary);
}
}
public class main2 {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2(101, "ajeet", 45000);
		Employee2 e2 = new Employee2(102, "irfan", 25000);
		Employee2 e3 = new Employee2(103, "nakul", 55000);
		e1.display();
		e2.display();
		e3.display();
	}
}
