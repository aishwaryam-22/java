package assignment1;

public class For_loop2 {

	public static void main(String[] args) {
		int num=8;
		boolean isPrime= true;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
			}
		}
		if(isPrime==true)
		{
			System.out.println("prime number");
			
		}
		else
		{
			System.out.println("not prime number");
		}

	}

}
