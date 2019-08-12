package simple.def.pack;

class Demo{
	
}

public class twodarray {
	
	int a=9;
	int b=60;
	static int c =90;
	Demo d=new Demo();
	
	
	public static int m1() {
		twodarray td1=new twodarray();
		//return c;
		Testpack t=new Testpack();
		return td1.b+c;
	
		
		
	}
	
	public int mr2() {
		twodarray td2=new twodarray();
		return c+a;
	}
	
	
	

	public static void main(String[] args) {
		twodarray td1=new twodarray();
		td1.a=87;
		twodarray td2=new twodarray();
		td2=td1;
		System.out.println(td2.a);
		System.out.println(td1.a);
		Demo d=new Demo();
		System.out.println(m1());
		System.out.println("********");
		int a[][]=new int[2][3];
		a[1][1]=9;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
		System.err.println("This in red");

	}

}
