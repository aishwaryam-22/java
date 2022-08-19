
public class Demo2 {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0d;
		char c='a';
		boolean b2=true;
		//autoboxing:converting primitive datatypes into objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		System.out.println(byteobj);
		System.out.println(shortobj);
		System.out.println(intobj);
		System.out.println(longobj);
		System.out.println(floatobj);
		System.out.println(doubleobj);
		System.out.println(charobj);
		System.out.println(boolobj);
		//converting objects to primitives
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		System.out.println(bytevalue);
		System.out.println(shortvalue);
		System.out.println(intvalue);
		System.out.println(longvalue);
		System.out.println(floatvalue);
		System.out.println(doublevalue);
		System.out.println(charvalue);
		System.out.println(boolvalue);
		
	}

}
