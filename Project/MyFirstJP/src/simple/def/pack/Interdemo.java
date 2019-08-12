package simple.def.pack;

import java.util.Date;

interface Thai{
	
	public static final int ls=10;
	public abstract void POA();
	public static void itworks() {
		System.out.println("To demo that static method can exist in Interfaces!");
	}
	public default void Let() {
		System.out.println("Default method");
	}
	
	
}

interface Jap extends Thai{
	public void nextPOA();
}

class Italy implements Jap{
	public void POA() {
		System.out.println("This is plan of action!");
	}
	public void nextPOA() {
		System.out.println("This is the next plan of action!");
	}
	
	
}

public class Interdemo {

	public static void main(String[] args) {
		
		Jap J=new Italy();
		J.POA();
		J.nextPOA();
		System.out.println(J.ls);
		J.Let();
		
		
		
		
		
		Date d=new Date();
		System.out.println("Today's date is: " +d);
		String ds=d.toString().replaceAll(":","_").replaceAll(" ", "_");
		System.out.println("Date when converted to string: " +ds);
		Thai.itworks();
		Date da=new Date();
		System.out.println(da.toString());
		
		

	}

}
