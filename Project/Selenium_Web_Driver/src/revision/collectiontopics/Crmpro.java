package revision.collectiontopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(revision.collectiontopics.Itestlischeck.class)
public class Crmpro {
	
	EventFiringWebDriver driver;
	public void isAlertPresent() {
		try {
			Alert a=driver.switchTo().alert();
			a.accept();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

	@Test
	public void crmpro() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		DesiredCapabilities dp=new DesiredCapabilities();
		ChromeOptions co=new ChromeOptions();
		co.setHeadless(true); //executing chrome in headless mode instead of using HTML Unit Driver
		dp.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dp.acceptInsecureCerts();
		dp.setPlatform(Platform.ANY);
		co.merge(dp); // To merge chrome options with desired capabilities.
		WebDriver dr=new ChromeDriver(co);
		EventFiringWebDriver driver=new EventFiringWebDriver(dr);
		Mylistenerrev ml=new Mylistenerrev();
		driver.register(ml);
		driver.get("https://www.crmpro.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('This is a dummy alert');");
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.accept();
		Thread.sleep(4000);
		WebElement bot_frame=driver.findElement(By.xpath("//iframe[@name='intercom-borderless-frame']"));
		driver.switchTo().frame(bot_frame);
		Actions act=new Actions(driver);
	    WebElement botbody=driver.findElement(By.xpath("//div[@class='intercom-borderless-header']"));
	    WebElement botdismiss=driver.findElement(By.xpath("//div[@class='intercom-borderless-dismiss-button']"));
	    act.moveToElement(botbody).build().perform();
	    act.click(botdismiss).build().perform();
	    Thread.sleep(5000);
		driver.quit();
		
	}
	
	
}
