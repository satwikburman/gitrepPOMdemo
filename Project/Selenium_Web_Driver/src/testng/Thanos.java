package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Thanos {
	WebDriver driver;
	
	@BeforeTest
	public void open() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void Endgame() throws AWTException, InterruptedException {
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("thanos");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@class='c3yYr']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//*[@class='c3yYr']")).click();
		Thread.sleep(20000);
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}

}
