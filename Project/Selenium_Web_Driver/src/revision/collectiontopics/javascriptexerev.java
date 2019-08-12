package revision.collectiontopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class javascriptexerev {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		ChromeOptions chro_op=new ChromeOptions();
		chro_op.addArguments("--disable-infobars");
		DesiredCapabilities dp=new DesiredCapabilities();
		dp.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		chro_op.merge(dp);
		WebDriver driver=new ChromeDriver(chro_op);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
		JavascriptExecutor jsx=(JavascriptExecutor) driver;
		jsx.executeScript("history.go(0);");
		String jsx_Title=jsx.executeScript("return document.title;").toString();
		String page_Text=jsx.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(page_Text);
		System.out.println("Title is " +jsx_Title);
		WebElement for_test=driver.findElement(By.name("bSubmit"));
		jsx.executeScript("arguments[0].style.border='3px solid red';", for_test); //Bordering the WebElement here
		jsx.executeScript("arguments[0].click()", for_test); //Hits the JS lib inside the embedded HTML code at DOM level and not at UI level
		Thread.sleep(4000);
		driver.quit();
		
	}

}
