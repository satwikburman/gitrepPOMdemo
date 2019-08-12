package simple.def.pack;

abstract class A{
	abstract void absone();
	abstract void abstwo();
}

abstract class B extends A{

	

	@Override
	void abstwo() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * @Override void abstwo() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	
}

class c extends B{

	@Override
	void absone() {
		// TODO Auto-generated method stub
		
	}
	
}
class Hill{
	
	static int b;
	
	public static String test="Just Checking";
	Hill(){
		this(6);
		System.out.println("Default hill cons");
	}
	
	Hill(int x){
		//this();
		System.out.println("Param hill cons" +x);
		
		
	}
	
	
	
	
	static void lul() {
		System.out.println("Checking LUL");
		System.out.println(test);
		
	}
	
}

public class Check extends Hill {
	int a;
	static final int stat;
	static {
     stat=8;
	}
	Check(){
		
	}
	/*
	 * void lul() { //Static methods cannot be overridden
	 * 
	 * }
	 */
	
	  Check(String s){
		  //super(5);
		  System.out.println("Default check const" +s);
	 
	  }
	  
	
	 

	public static void main(String[] args) {
		String s="goforit";
		String s2="goforit";
		System.out.println(s==s2);
		
		int a=(int) 87.6;
		Check c1=new Check();
		c1.a=9;
		System.out.println("Value before conv"+c1.a);
		Check c2=new Check();
		c2=c1;
		System.out.println("value after conv"+c2.a);
		System.out.println(c1.stat);
		Check c=new Check("Help");
		int arr[]= {5,9,31,54,82,14,7};
		
		for(int i=0;i<arr.length-1;i++) {
		 if(arr[i]>arr[i+1]) {
			 int diff1=arr[i]-arr[i+1];
			 System.out.println(diff1);
		 }
		 else {
			 int diff2=arr[i+1]-arr[i];
			 System.out.println(diff2);
			 
		 }
		}
		
		System.out.println(stat);
		c.lul();
		
		int ar[]= {5,3,6,7,4,3,9,2,6,8,6};
		System.out.println(arr.length);
		//int temp=ar[0];
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if((ar[i]==ar[j])&&(i!=j)) {
				System.out.println(ar[j]);
				//Here both i and j are remove indexes but let's start with j
				for(int k=j;k<ar.length-1;k++) {
					ar[k]=ar[k+1];
				}
				}
			}
			
			System.out.println("##############################");
			for(int k=0;k<ar.length;k++) {
				System.out.println(ar[k]);
			}
			System.out.println("**********************");
		}
		String chuck="9";
		int toconvert=78;
		String convertedstring1=String.valueOf(toconvert);
		String convertedstring2=Integer.toString(toconvert);
		
		//Arrays.toString();
		//Arrays.asList();
	}

}
