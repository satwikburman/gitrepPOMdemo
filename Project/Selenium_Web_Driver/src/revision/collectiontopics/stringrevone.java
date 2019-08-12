package revision.collectiontopics;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class stringrevone {
	

	//@Test
	public void One() {
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("The entered string is: " +input);
		int lenofstr=input.length();
		String charset="";
		String intset="";
		String spclcharset="";
		String whiteset="";
		for(int i=0;i<lenofstr;i++) {
			if(Character.isDigit(input.charAt(i))) {
				intset=intset+input.charAt(i);
			}
			else if(Character.isAlphabetic(input.charAt(i))) {
				charset=charset+input.charAt(i);
			}
			else if(Character.isWhitespace(input.charAt(i))) {
				
				whiteset=whiteset+input.charAt(i);
			}
			else {
				spclcharset=spclcharset+input.charAt(i);
			}
			
		}
		System.out.println("Getting ints from string by Integer class value: " +Integer.getInteger(input));
		System.out.println(charset);
		System.out.println(intset);
		System.out.println(spclcharset);
		
		String num="248.6";
		double dxc=Double.parseDouble(num);
		System.out.println(dxc);
		
		int pal=12345;
		String palstr=Integer.toString(pal);
		System.out.println("After conversion the value would be: " +palstr);
		String rev="";
		for(int i=palstr.length()-1;i>=0;i--) {
			rev=rev+palstr.charAt(i);
		}

		System.out.println("Reversed string is " +rev);
		int conv=Integer.parseInt(rev);
		System.out.println("Integer after reversing is" +conv);
		
		StringBuffer sb=new StringBuffer("Hello Jam");
		sb.reverse();
		System.out.println(sb); //Thread safe but not efficient.
		
		String chastr="Gustil Heminanch";
		char[] ch=chastr.toCharArray();
		try {
		for(int j=0;j<=chastr.length();j++) {
			System.out.println(ch[j]);
		}
		}
		catch(Exception e) {
			System.out.println("An exception got caught " +e.getMessage());
		}
		
		
	}
	
	@Test
	public void googlelinks() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size()); // As of now 27 links are there in total that has to be tested from QA perspective.
		for(WebElement webele:links) {
			String urltotest=webele.getAttribute("href");
			validateurl(urltotest);
		}
		Thread.sleep(4000);
		driver.quit();
		
		
	}
	
	@Test
	public void excelling() throws IOException {
		
		OutputStream os=new FileOutputStream("C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\Testnew.xlsx");
		Workbook wb=new XSSFWorkbook();
		org.apache.poi.ss.usermodel.Sheet s1=wb.createSheet("Hakuna");
		Row r=s1.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("Going");
		wb.write(os);
		Cell newcell=s1.getRow(0).getCell(0);
		int lastcell=s1.getRow(0).getLastCellNum();
		System.out.println(lastcell);
		int lastrow=s1.getLastRowNum();
		System.out.println(lastrow);
		String result=newcell.getStringCellValue();
		System.out.println(result);
		String user_dir=System.getProperty("user.dir");
		System.out.println("Current working directory is: " +user_dir);
		
	}
	
	public static void validateurl(String url) throws IOException {
		try {
		URL conurl=new URL(url);
		HttpURLConnection httpurlcon=(HttpURLConnection)conurl.openConnection();//Type casting to type of url and opening the url connection in it
		//An url connection instance is returned when this code is executed.
		httpurlcon.setConnectTimeout(3000);
		httpurlcon.connect();
		//Next would be to record the response when the url is being hit via restfull API response over HTTPS/HTTP client.
		//Object is used to create a connection in between the client and the web server.
		if(httpurlcon.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
			System.out.println(url+" : response code is "+httpurlcon.getResponseMessage());
		}
		else if(httpurlcon.getResponseCode()==200) {
			System.out.println(url+" : response code is "+httpurlcon.getResponseMessage());
		}
		else {
			System.out.println("Outside the domain of Response codes");
		}
		}
		catch (Exception e) {
		 System.out.println("The desired exception caught is: " +e.getMessage());
		}
		
	}

}
