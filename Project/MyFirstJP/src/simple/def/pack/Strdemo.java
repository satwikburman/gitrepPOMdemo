package simple.def.pack;

public class Strdemo {

	public static void main(String[] args) {
		char ch[]= {'a','t','t','a','b','o','y'};
		String s=new String(ch);
		System.out.println(s.indexOf("b")+1);
		System.out.println("String after ch array conversion is " +s);
		String str="Selenium Webdriver";
		String str2=new String("QTP is a licensed product and not open source");
		boolean status1=str.startsWith("Sel");
		System.out.println("Status one is " +status1);
		boolean status2=str.endsWith("QTP");
		System.out.println("Status two is " +status2);
		boolean status3=str.contains("Web");
		System.out.println("Status three is " +status3);
		boolean status4=str.equalsIgnoreCase(str);
		System.out.println("Status four is " +status4);
		String str3=str.concat(str2);
		System.out.println("Concatinated String is " +str3);
		String spl="Hybrid-Cloud-Environment";
		String sep[]=spl.split("-");
		L1:
		for(int i=0;i<sep.length;i++)
		{
			System.out.println(sep[i]);
			if(sep[i].equalsIgnoreCase("cloud"))
			{
				System.out.println("Test Passed");
				break L1;
			}
			
			
		}
		System.out.println(str2.substring(0,4));
		int str_len=str2.length();
		System.out.println(str_len);
		char[] strtochar=s.toCharArray();
		System.out.println(strtochar);
	}

}
