
public class demo2 {

	public static void main(String[] args) {
		String s = "Great", t = "H";
		String u = s.concat(t);
		if(u == s){
		System.out.println("Same"); }
		else{
		System.out.println("Not same"); }
		String e = s + t;
		if (e == s){
		System.out.println("Same");
		}
		else{
		System.out.println("Not same"); }
	}
}
