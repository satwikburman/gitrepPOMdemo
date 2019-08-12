package simple.def.pack;

class Parent{
	
	public static final int test;
	
	static {
		test=471;
	}
	
	void M1() {
		System.out.println("In parent");
	}
	int m=5;
	void G1() {
		System.out.println("Whatever");
	}
	
}

class Child extends Parent{
	void M1() {
		System.out.println("In Child!");
	}
	int m=6;
	void G2() {
		System.out.println("With me!");
	}
}
public class Staticdemo {
	public final int test;
	public static final int stat;
	
	
	Staticdemo(){
		test=10;
		System.out.println("Value of final variable is: " +test);
	}
	
	static {
		 stat=90;
	}

	public static void main(String[] args) {
		Staticdemo sd=new Staticdemo();
		// Blank final variable can only be declared inside the class constructor.Can also be declared in a static block.
		// A constructor cannot be declared final because it is not inherited.
		// A static final variable can be initialized inside a static block.
		Parent p=new Child();
		p.M1(); // Late binding holds good for methods.
	    System.out.println(p.m); // Late binding does not hold true for variables. Object type determined at run-time.
	    System.out.println(sd.stat);
	    p.G1(); // Taking method od parent but not of child only overriden method of child it takes
		System.out.println(p.test);
		
		
	}

}
