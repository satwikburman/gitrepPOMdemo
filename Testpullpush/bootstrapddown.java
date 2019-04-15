package sel.webdrriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapddown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("menu1")).click();
        Thread.sleep(5000);
        List<WebElement> LWE=driver.findElements(By.xpath("//button[contains(@id,'menu1')]//following::ul[@class='dropdown-menu']/li/a"));
        for(WebElement e:LWE) {
        	if(e.getAttribute("innerHTML").equalsIgnoreCase("javascript")) {
        		System.out.println("Redirecting");
        		e.click();
        		break;
        	}
        	System.out.println(e.getAttribute("innerHTML"));
        }
        System.out.println(driver.getCurrentUrl());
        driver.quit();
	}

}
