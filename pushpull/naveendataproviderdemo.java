package testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class naveendataproviderdemo   {
	
	


	WebDriver driver;
	
	

	
	
	
	@BeforeTest
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
	    
	}
	@AfterTest
	public void crash() {
		driver.quit();
	}
	
	@DataProvider
	public Iterator<Object[]> fetchData() throws IOException {
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		xlsinputstream xltest=new xlsinputstream("C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\Naveentestdata.xlsx");
		int rowcount=xltest.getrowcount("ebay");
		System.out.println(rowcount);
		for(int i=2;i<=rowcount;i++) {
			String fname=xltest.getvalue("ebay", i, 1);
			String lname=xltest.getvalue("ebay", i, 2);
			String add1=xltest.getvalue("ebay", i, 3);
			String add2=xltest.getvalue("ebay", i, 4);
			String city=xltest.getvalue("ebay", i, 5);
			String state=xltest.getvalue("ebay", i, 6);
			String zipcode=xltest.getvalue("ebay", i, 7);
			String emailid=xltest.getvalue("ebay", i, 8);
			
			Object ob[]= {fname,lname,add1,add2,city,state,zipcode,emailid};
			
			mydata.add(ob);
		}
		
		
		return mydata.iterator();
		
	}
	
	@Test(dataProvider="fetchData")
	public void dataParse(String fname, String lname, String add1, String add2, String city, String state, String zipcode,String emailid) {
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(fname);
		
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lname);
		
		driver.findElement(By.id("address1")).clear();
		driver.findElement(By.id("address1")).sendKeys(add1);
		
		driver.findElement(By.id("address2")).clear();
		driver.findElement(By.id("address2")).sendKeys(add2);
		
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(city);
		
		WebElement stateddown=driver.findElement(By.id("state"));
		Select sel=new Select(stateddown);
		sel.selectByVisibleText(state);
		
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys(zipcode);
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(emailid);
		
	}
	

}
