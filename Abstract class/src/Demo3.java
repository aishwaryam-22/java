abstract class Bikee{
	Bikee(){
		System.out.println("bike created");
	}
	abstract void run();
	void changegear() {
		System.out.println("gear changed");
	}
}
class Hondaa extends Bikee{
	void run() {
		System.out.println("running safely");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Hondaa h=new Hondaa();
		h.run();
		h.changegear();

	}

}
