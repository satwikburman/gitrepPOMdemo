package sel.webdrriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowIDver {
	public static WebDriver driver,driver2;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.travelguru.com/");
		//List<WebElement> toph=
		driver.findElement(By.cssSelector("div.menu>ul>div>ul>li>a:nth-child(1)")).click(); // Check this CSS selector
		/*
		 * for(WebElement fetch:toph) {
		 * if(fetch.getText().equalsIgnoreCase("become a host")) { fetch.click(); }
		 * System.out.println(fetch.getText()); }
		 */
		Set<String> lwh=driver.getWindowHandles();	
	    Iterator listr=lwh.iterator();
	    String s1=(String) listr.next();//By default iterator gives object data type
	    String s2=(String) listr.next();// Obj data type is converted to string
	    System.out.println(s2);
	    driver.switchTo().window(s2);
	    System.out.println("Check point");
	    System.out.println(lwh.size());
	    String com=driver.getWindowHandle();
	    if(com.equals(s2)) {
	    	System.out.println("Page access transferred to next page");
	    }
		
		
		  driver.findElement(By.name("password")).sendKeys("123456");
		  driver.findElement(By.name("emailId")).sendKeys("aspiral");
		 
		 
	    driver.quit();
	 
	    
		
		  System.out.println("*************NEXT OPP***********************");
		  driver2=new ChromeDriver();
		  driver2.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		  driver2.manage().window().maximize();
		  List<WebElement> lifra=driver2.findElements(By.tagName("frame"));
		  System.out.println(lifra.size()); 
		  //for(WebElement t:lifra)
		  for(int i=0;i<lifra.size();i++) {	  
		  driver2.switchTo().frame(lifra.get(i)); 
		  int x=driver2.findElements(By.linkText("Alert")).size();
		  if(x>0) {
			  WebElement toclick=driver2.findElement(By.linkText("Alert"));
			  toclick.click();
			  System.out.println("Operation has been performed");
			  //break;
		  }
		  System.out.println("for"+(i+1)+"value is"+x);
		  driver2.switchTo().defaultContent();
		  
		  } 
		  driver2.quit();
		 
	    
		

	}

}

