package simple.def.pack;


public class Prilims {

	static int cl=90;;// Declaring static variable.
	static String s="Global";
	public static void main(String[] args) {
		s="not null";
		String s="Holla!";
		s="Lolla";
		
		System.err.println("Error");// Error object of print stream
		System.out.println("Printing global variable "+s);// Printing global variable defined locally.
		System.out.println(Prilims.s);
		cl=9;
		System.out.println("Printing locally declared var with same name as global variable "+cl);
		int  var = 0;
		System.out.println("This program is to test variables in Java!");
		int a=2;
		System.out.println("Value of a is "  +a);
		char test='U';
		System.out.println("Value of test is "  +test);
		char ascitest=69;
		System.out.println("Value of asci test is "  +ascitest);
		int marks=(int)86.76; //down casting
		System.out.println("Value of mark test is "  +marks);
		float newmarks=67.9f;
		System.out.println("Value of newmark test is "  +newmarks);
		System.out.println("Value of Local variable is "  +var);
		System.out.println("Value of Global Variable is "  +Prilims.cl);
		for(int i=0;i<=10;i++) {
			System.out.print(" "+i); //for loop
			}
		
		int j=25;
		while(j!=30)
		{
			System.out.print(" " +j); //while loop
			j++;
		}
		
		String browser="Firefox";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Browser is Chrome" );
		}
		else if(browser.equalsIgnoreCase("Firefox")) 
			
		{
			System.out.println(" Browser is Firefox" );
		}
		else
		{
			System.out.println("Browser is something else" );
		}
		
		int x=10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(10<<3);
		System.out.println(24>>3);
		s2:
		for(int n=1;n<=3;n++)
		{    
           s1:
            for(int m=1;m<=3;m++)
            {    
                if(n==2&&m==2)
                {    
                   continue;
                    //break;    
                }    
                System.out.println(n+" "+m);    
            }
		}
   
		}
		}
	


