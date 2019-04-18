package testng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testngtest {
	
	
	static WebDriver driver,driver2,driver3;
	
  @Test(priority=2)
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://seleniumpractise.blogspot.com/");
	  WebElement selmal=driver.findElement(By.id("tools"));
	  Select sel=new Select(selmal);
	  List<WebElement> mytools=sel.getOptions();
	  List com=new ArrayList();
	  for(WebElement current:mytools) {
		  com.add(current.getText());
	  }
	  System.out.println(com);
	  List sorttest=new ArrayList();
	  sorttest.addAll(com);
	  System.out.println(sorttest);
	  // So we have two lists one com and one sortest, we would sort sortest and compare to com, com should be untouched.
	  // By default list is sorted in ascending order then reverseOrder() would be in descending order.
	  Collections.sort(sorttest);
	  System.out.println(sorttest);
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(sorttest, com);
	  s.assertAll(); // So that failure gets caught
	  driver.quit();
	  

  }
  @Test(priority=1)
  public void openweb() {
	  System.out.println("Next test case triggered");
  }
  @BeforeClass
  public void befclass() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
	  driver2=new ChromeDriver();
	  driver2.get("https://www.google.com/");
	  driver2.manage().window().maximize();
	  System.out.println(driver3);
	  driver2.quit();
  }
  @AfterClass
  public void afclass() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
	  //System.out.println(driver3);
	  driver3=new ChromeDriver();
	  driver3.get("https://www.manutd.com/");
	  System.out.println(driver3);
	  driver3.quit();
	  
  }
  @BeforeMethod
  public void befmethod() {
	  System.out.println("Executing before test methods");
	  
	  
  }
  @AfterMethod
  public void afmethod() {
	  System.out.println("Executing after test methods");
  }
  //Data providing class on display
  @Test(priority=3,dataProvider="passing")
  public void pars(Object a,Object b, Object c) {
	  System.out.println("First el"+a+"Second ele"+b+"Third ele"+c);
	  
  }
  @DataProvider
  public Object[][] passing() {
	  Object[][] ob=new Object[2][3];
	  
	  ob[0][0]=8;
	  ob[0][1]="p1";
	  ob[0][2]=87.9;
		
	  ob[1][0]="u2";
	  ob[1][1]=true;
      ob[1][2]="e2";
	  return ob;
	  
  }
}
