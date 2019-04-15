package sel.webdrriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtesting {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		//Taking snap shot
		/*
		 * TakesScreenshot ts=(TakesScreenshot) driver; File
		 * source=ts.getScreenshotAs(OutputType.FILE);
		 * org.openqa.selenium.io.FileHandler.copy(source, new
		 * File("C:\\Selenium Training Workspace\\Selenium_Web_Driver\\Snapshots\\test.png"
		 * )); System.out.println("Snap shot taken");
		 */
		//Snap shot taken+++++++++++++++++++++++++++++++++++++++
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		Utilib.Snapshot(driver, "Post_Login"); //Taking snap shot via calling method and maintaining library
		driver.findElement(By.xpath("//*[text()='Customise Your Site']//following::p[1]/a")).click();
		driver.navigate().back();
		System.out.println("***************");
		List<WebElement> nsteps=driver.findElements(By.xpath("//*[contains(text(),'Next Steps')]//following::ul[1]/li/a"));		
		for(WebElement steps:nsteps) {
			System.out.println(steps.getText());
		}
		System.out.println("**************");
		List<WebElement> mlist=driver.findElements(By.xpath("//div[@id='adminmenuwrap']/ul[@id='adminmenu']/li/a/div[3]"));
		for(int i=0;i<mlist.size();i++) {
			System.out.println(mlist.get(i).getText());
		}
		System.out.println("***************");
		driver.findElement(By.xpath("//a[@class='wp-first-item current']//preceding::div[1]")).click();
		driver.navigate().back();
		List<WebElement> ml=driver.findElements(By.xpath("//a[contains(text(),'Meetups')]//preceding::ul[1]/li/a"));
		System.out.println("Going to second step");
		
		  for(WebElement mdata2:ml) { System.out.println(mdata2.getText()); }
		 
		Thread.sleep(7000);
		System.out.println("*******************");
		System.out.println("Xpath demo session killed");
		driver.quit();
		

	}

}
