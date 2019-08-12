package simple.def.pack;

public class Constest {
	int a;
	int b;
	double c;
	String d;
	 Constest(int a,double c){
		
		this.a=a;
		this.c=c;
		System.out.println("First constructor invoked");
	}
	Constest(int b,String d){
		this.b=b;
		this.d=d;
		System.out.println("Second constructor invoked");
	}
	 void inst() {
		System.out.println(this);
		
	}
	Constest(){
		this(6);
	}
	
	Constest(int a){
		System.out.println(a);
	}

	public static void main(String[] args) {
		Constest c=new Constest(74,98.7);
		Constest c2=new Constest(86,"Lezz");
		System.out.println(c2);
		c.inst();
		Constest c3=new Constest();
		System.out.println(c);
		

	}

}
