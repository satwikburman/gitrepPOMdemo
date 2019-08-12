package simple.def.pack;

abstract class bike {
	bike(){
		System.out.println("Ride Safe!");
	}
	 abstract void Ride();
	abstract int Pass(int b);
	void Gshift(String name) {
		System.out.println("Passed String is: " +name);
		
	}
	static void test() {
		System.out.println("Static method check");
	}
	int abval=9;
	final void checking() {
		System.out.println("Checking final implementation");
	}
	
	
}

class KTM extends bike {
	 public void Ride() {
		System.out.println("KTM duke has better COG");
	}
	static String s;
	@Override
	public int Pass(int a) {
		
		return a;
	}
}
public class Absclassdemo {

	public static void main(String[] args) {
		bike b=new KTM();
		b.Gshift("YamahaFZ");
		b.Ride();
		System.out.println("Value of data var is" +b.abval);
		int vl=b.Pass(5);
		System.out.println(vl);
		b.test();
		System.out.println(KTM.s);
		b.checking();
		
		

	}

}
