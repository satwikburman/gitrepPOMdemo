package testng.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gridDemo {
	WebDriver driver;
	
	@BeforeTest
	public void bowactions() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.goibibo.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    Thread.sleep(50000);
	    
	    
	}
	//@Test
	public void search() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dp=new DesiredCapabilities();
		dp.acceptInsecureCerts();
		dp.setBrowserName("chrome");
		dp.setPlatform(Platform.ANY);
		RemoteWebDriver rwb=new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"),dp);
		rwb.get("https://www.google.com/");
		Thread.sleep(4000);
		rwb.quit();
	}
	@Test
	public int arrayAdd(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		return sum;
	}
	@Test
	public void disp() {
		//gridDemo gd=new gridDemo();
		int retsum=arrayAdd(34,45,67,89,28,74);
		System.out.println(retsum);
	}
	//@Test
	public void listenerTest() throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		    driver = new ChromeDriver();
		    EventFiringWebDriver Efwd=new EventFiringWebDriver(driver);
		    myListener mL=new myListener();
		    Efwd.register(mL);
		    Efwd.manage().window().maximize();
		    Efwd.get("https://www.goibibo.com/flights/");
			WebElement to_click=Efwd.findElement(By.linkText("Sign In"));
			to_click.click();
			Efwd.navigate().back();
		/*
		 * Thread.sleep(5000); driver.findElement(By.id(
		 * "webklipper-publisher-widget-container-notification-close-div")).click();
		 */
			Efwd.quit();
			
		
	}
	@Test
	public void goIbibo() throws InterruptedException {
		List<WebElement> goibibo_frames=driver.findElements(By.tagName("iframe"));
		System.out.println(goibibo_frames.size());
		driver.switchTo().frame("notification-frame-~2514428c7");
        driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
        driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Bang");
        Thread.sleep(2000);
        driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
        driver.findElement(By.id("fare_20190424")).click();
        driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
        driver.findElement(By.id("fare_20190430")).click();
        driver.findElement(By.xpath("//input[@id='gi_return_date']//following::div[2]")).click();
        driver.findElement(By.xpath("//button[@id='adultPaxPlus']")).click();
        driver.findElement(By.xpath("//button[@id='adultPaxPlus']")).click();
        driver.findElement(By.xpath("//button[@id='adultPaxPlus']")).click();
        WebElement ddown=driver.findElement(By.id("gi_class"));
        Select sel=new Select(ddown);
        sel.selectByValue("B");
        System.out.println(sel.getFirstSelectedOption());
        driver.findElement(By.xpath("//button[text()='SEARCH']")).click();
        
        
        
        
        
		
		}
	//@AfterTest
	public void browsercrash() {
		driver.quit();
	}
		
	}


