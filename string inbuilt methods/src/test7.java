
public class test7 {

	public static void main(String[] args) {
		String s1 = "You must be the change you wish to see in the world";
		System.out.println(s1.startsWith("Y"));
		System.out.println(s1.startsWith("You must"));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.startsWith("o", 1));
		System.out.println(s1.endsWith("d"));
		System.out.println(s1.endsWith("world"));
		System.out.println(s1.endsWith("eye"));
	}
}
