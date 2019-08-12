package simple.def.pack;
import java.util.Date;
import java.util.Scanner;

public class AssignOne {
	
	public void multab(int x) {
		for(int i=1;i<=x;i++) {
			int m=i*x;
			System.out.println(i+"*"+x+"="+m);
		}
		}
	public void addeven(int x) {
		int sum=0;
		for(int i=1;i<=x;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			
		}
		System.out.println("Sum is: "+sum);
		
	}
	public void adddec(int x) {
		int sum=0;
		while(x!=0) {
			sum=sum+x;
			x--;
		}
		System.out.println("Sum of add dec is: " +sum);
	}
	public void revnum(int x) {
		int rev=0;
		while(x!=0) {
			int dg=x%10;
			rev=rev*10+dg;
			x=x/10;
		}
		System.out.println("Reverse of number is "+rev);
	}
	public void fact(int x) {
		int fact=1;
		for(int i=1;i<=x;i++) {
			fact=fact*i;
			}
		System.out.println("Factorial is: "+fact);
	}
	
	
	public static void main(String[] args) {
		int num=9;
		AssignOne a=new AssignOne();
		a.multab(num); // Multiplication table of any number
		a.addeven(100);// Addition of even numbers up to any range
		a.adddec(10); // Adding numbers in descending number up to any range
		a.revnum(682);// reversing any number
		a.fact(5); // Factorial of any number
		
		Object obj[]= {6,'a',"Beyblade",true,69.10}; //Storing different data types in an object class
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		int arr[]= {2,5,8,7,10,1}; //Smallest number in an array
		int test=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<test)
				test=arr[i];
		}
		System.out.println("Smallest number is "+test);
		
		
		System.out.println("What is your marks?"); // Marks calculation
		Scanner in=new Scanner(System.in);
		int marks=in.nextInt();
		System.out.println("Marks you have entered is: "+marks);
		if(marks>30) {
			if(marks>=45 && marks<60) {
				System.out.println("You have secured second division division");
			}
			else {
				if(marks>=60) {
					System.out.println("You have secured first division division");
				}
				else {
					System.out.println("You have secured third division");
				}
			}
			
		}
		else
			System.out.println("You have failed");
		int ar1[][]=new int[3][3];
		
		Date d=new Date();
		String date=String.valueOf(d);
		System.out.println(date);
			}

}
