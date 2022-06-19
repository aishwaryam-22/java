package assignment1;

public class Swi3 {

	public static void main(String[] args) {
		String name = "te";
		switch(name.toLowerCase())
		{
		case "author":
			System.out.println("vikas");
			break;
		case "team":
			System.out.println("team java full stack");
			break;
		case "editor":
			System.out.println("vish and krish");
			break;
			default:
				System.out.println("invalid entry");
		}
	}

}
