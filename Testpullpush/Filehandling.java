package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Filehandling {
  WebDriver driver;
  @Test
  public void f() throws IOException {
	  driver.findElement(By.id("txt")).sendKeys("Dummy text as justification before submitting.");
	  driver.findElement(By.name("datafile")).click();
	  //driver.findElement(By.xpath("/html/body/form[1]/div/input")).click();
	  Process p=new ProcessBuilder("C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\autoITscripts\\uploadtest.exe","","Open").start();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class this module executes");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This model executes after class");
	  int num=54;
	  Random r=new Random();
	  int a=r.nextInt(num);
	  double t=Math.random();
	  System.out.println(a);
	  System.out.println(t);
  }

  @BeforeTest
  public void beforeTest() {
	    System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jkorpela.fi/forms/file.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.manage().deleteAllCookies();
	  driver.quit();
  }

}
