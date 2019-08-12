package simple.def.pack;

public class Clob {
	
	int x;
	String j;
	int tp1;
	String tp2;
	static String stastr="dummy";
	static void change() //Changing static value 
	{
		
		 stastr="This is gonna get memory only once";
	}
	Clob(){
		
	}
	Clob(int tp1,String tp2)
	{
		this.tp1=tp1;
		this.tp2=tp2;
		}
	
	Clob(Clob cnew){
		this.tp1=cnew.tp1;
		this.tp2=cnew.tp2;
		
	}
	
	public void disp() {
		System.out.println("Result is " +this.tp1);
		System.out.println("Result is " +this.tp2);
		System.out.println("Result is " +this.stastr);
	}
	
	public static int Add(int x,int y) 
	{
		return(x+y);
	}

	public static int Add(int x,int y,int z) 
	{
		return(x+y+z);
	}
	
	public static void main(String[] args) {
		Clob c=new Clob();
		int result=c.Add(10,20);
		int newresult=c.Add(10,20,30);
		System.out.println("Result is " +result);
		System.out.println("Result is " +newresult);
		c.disp();
		
		
		c.x=20;
		c.j="Test String";
		System.out.println(+c.x);
		System.out.println("String is " +c.j);
		
		Clob c2=new Clob(69,"Hannah");
		c2.change();
		c2.disp();
		Clob c3=new Clob(c2); //current state of c2 getting 
		c3.disp();
		Clob c4=new Clob(7, "Check");
		c4.disp();
		

	}

}
