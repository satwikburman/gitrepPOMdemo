package simple.def.pack;

class Leo {
	int l1;
	int l2;
	String Lstr;
	Leo(int l1,int l2){
		this.l1=l1;
		this.l2=l2;
		
	}
	Leo(int l1,int l2,String Lstr){
		this(l1,l2);
		this.Lstr=Lstr;
	}
	
	void Dispone()
	{
		System.out.println(" "+this.l1+" "+this.l2+" "+this.Lstr);
	}
	
}

class CR extends Leo {
	
	String BD;

	CR(int l1, int l2, String Lstr, String BD) {
		super(l1, l2, Lstr);
		this.BD=BD;
		
	}
	void Dispone()
	{
		System.out.println(" "+this.l1+" "+this.l2+" "+this.Lstr+" "+this.BD);
	}
	
}

public class SuperThis {

	public static void main(String[] args) {
		
		Leo LM=new Leo(720,1080,"Leo Messi");
		CR C=new CR(420,340,"Ronaldo","Ballon DOr");
		LM.Dispone();
		C.Dispone();
		
		
		

	}

}
