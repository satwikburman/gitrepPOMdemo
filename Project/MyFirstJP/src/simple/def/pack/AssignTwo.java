package simple.def.pack;

class Car {

	
	  Car(String s) {
	  
	  System.out.println(s); }
	 

	
	  Car() {
	  
	  System.out.println("Default car constructor"); }
	 

	void start() {
		System.out.println("Starting parent car");

	}

	void stop() {
		System.out.println("Stop function of parent car");
	}

	void repair() {
		System.out.println("Repairing of parent class");
	}
}

class BMW extends Car {
	BMW(String s) {
		
		super(s);
		System.out.println("Passing string" + s);
		super.start();
	}

	BMW() {
		System.out.println("Default BMW constructor");
		
		super.repair();
	}

	void start() {
		System.out.println("Start of BMW");
	}

	void repair() {
		System.out.println("Advanced repair of BMW");
	}

	void sc() {
		System.out.println("Sc is automated PF");
	}

}

class Audi extends BMW {
	Audi() {
		super.repair();
		sc();
		System.out.println("Default Audi constructor");
	}

	void start() {
		System.out.println("Auto start of Audi");
	}

	void sc() {
		System.out.println("Audi SC only takes care via ticketing");
	}

	void colour() {
		System.out.println("Audi colour is mostly Mate finished");
	}
}

public class AssignTwo {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println("*******************");
		Car c2=new Car();
		System.out.println("*******************");
		BMW b=new BMW("M3GTR");
		System.out.println("*******************");
		Audi a=new Audi();
		System.out.println("*******************");
		BMW b1=new Audi();
		System.out.println("*******************");
		Car c1=new BMW("Hellstorm");
		System.out.println("*******************");
		Car c21=new Audi();
		System.out.println("*******************");
		c.start();
		c.stop();
		c.repair();
		System.out.println("*****************");
		b.sc();
		b.repair();
		b.start();
		b.stop();
		System.out.println("*****************");
		c=c21;
		boolean check=c.equals(c21);
		System.out.println(check);
		System.out.println("*****************");
		b1.start();
		b1.sc();
		System.out.println("*****************");
		c1.start();
		Car c4=new Car();
		boolean t1=c.equals(c4);
		System.out.println(t1);
		c4=c;
		boolean t2=c.equals(c4);
		System.out.println(t2);
		
		

	}

}
