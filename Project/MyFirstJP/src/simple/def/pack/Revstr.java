package simple.def.pack;

import java.util.Scanner;

interface P1{
	default void promo(){
		System.out.println("In P1");
	}
}
interface P2{
	default void promo() {
		System.out.println("In P2");
	}
}


public class Revstr implements P1, P2 {
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter a string to be reversed:");
		Scanner sc=new Scanner(System.in);
		String istr=sc.nextLine();
		System.out.println("String to be reversed is: " +istr);
		
		String rev=""; //String is non mutable
		for(int i=istr.length()-1;i>=0;i--) {
			rev=rev+istr.charAt(i);
		}
		System.out.println("Reversed String is: " +rev);
		
		StringBuffer sb=new StringBuffer("Mbappe");
		sb.reverse();
		System.out.println(sb); //String Buffer is mutable
		
		System.out.println("************************");
		
		Revstr rs=new Revstr();
		rs.promo();
		
	}

	@Override
	public void promo() {
		
		P1.super.promo();
		P2.super.promo();
	}

}
