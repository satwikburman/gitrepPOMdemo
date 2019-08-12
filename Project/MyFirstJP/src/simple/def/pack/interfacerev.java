package simple.def.pack;
class Test{
	
}

interface G3{
	
}
interface G1{
	public void kill();
}

interface G2 extends G1,G3{
	public void kill();
	static void put() {
		System.out.println("Demo check");
	}
}
public class interfacerev extends Test implements G1,G2 {

	public static void main(String[] args) {
		interfacerev I=new interfacerev();
		I.kill();
		check();
		

		
	}
	
	public void ghost() {
		
	}
	
	public static void check() {
		System.out.println("Huule");
	}

	@Override
	public void kill() {
		System.out.println("Kill from both");
	
		
		
	}

}
