import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the row value: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		char ch = 'A';
		for(int j=1;j<=i;j++)
		System.out.print(ch++);//A
		System.out.println();
		}
	}
}
