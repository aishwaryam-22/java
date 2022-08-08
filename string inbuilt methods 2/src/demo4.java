
public class demo4 {

	public static void main(String[] args) {
		String s1 = "hello to you";
		char[] ch = s1.toCharArray();
		int len = ch.length;
		System.out.println(len);
		for (int i = 0; i < len; i++) {
		System.out.print(ch[i]);
		}
	}
}
