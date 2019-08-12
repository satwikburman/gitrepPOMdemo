package revision.collectiontopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javascriptexecutorrev {

	WebDriver driver;
	JavascriptExecutor jsx;
	
	@BeforeTest
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.americangolf.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void checking() throws InterruptedException {
		jsx=(JavascriptExecutor) driver; //down casting to access methods.
		List<WebElement> lwebele=driver.findElements(By.tagName("iframe"));
		System.out.println(lwebele.size());
		WebElement to_click_GPBE=driver.findElement(By.xpath("//div[@id='header-navigation']/div[1]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(to_click_GPBE).build().perform();
		//driver.findElement(By.linkText("Shoes")).click();
		WebElement shoes=driver.findElement(By.linkText("Shoes"));
		jsx.executeAsyncScript("arguments[0].click();", shoes);
		//Thread.sleep(40000);
		//System.out.println(System.currentTimeMillis());
		System.out.println("Checking breakpoint");
		jsx.executeScript("window.scrollBy(0,1500)","");
		WebElement scroll=driver.findElement(By.xpath("//div[@id='secondary']//div[@class='noUi-handle noUi-handle-upper']"));
		act.dragAndDropBy(scroll, -100, 0).build().perform();
		

	}
	
	@AfterTest
	public void quitbrowser() {
		driver.quit();
	}
	
}
