package simple.def.pack;

public class Execepling {
 int heml=20;
	void change() {
		heml=8;
	}

	public static void main(String[] args) {
		Execepling el=new Execepling();
		el.change();
		System.out.println(el.heml);
		
		
		
		try {
			/*int a=10/0;
			int b[]=new int[4];
			System.out.println(b[7]);
			System.out.println(a);*/
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
	    System.out.println("Exception here is" +e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This time error would be" +e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Please check the exception case where code got stuck: " +e.getMessage());
			
		}
		catch(Exception e) {
			System.out.println("Mother of all exceptions" +e.getMessage());
			
		}
		finally {
			System.out.println("You have reached finally block");
		}
		
		System.out.println("Program has ended without any abnormal breaks!");

	}


}
