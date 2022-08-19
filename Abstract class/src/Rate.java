abstract class bank{
	abstract int rateofinterest();
}
class SBI extends bank{
	int rateofinterest() {
		return 7;
	}
}
class HDFC extends bank{
	int rateofinterest() {
		return 8;
	}
}
public class Rate {

	public static void main(String[] args) {
		SBI s=new SBI();
		HDFC h=new HDFC();
		h.rateofinterest();
		System.out.println("the rate of interest in SBI:"+s.rateofinterest());
		System.out.println("the rate of interest in HDFC:"+h.rateofinterest());

	}

}
