package testng.pomnopcom.baseactionmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testng.*;
import sel.webdrriver.*;



public class BaseActions extends Utilib {
	public WebDriver driver;
	public void init(String url) {
		if(Utilib.getprop("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	    }
		else {
			System.out.println("Invalid browser");
		}
		
	}
	public void end() {
		driver.quit();
	}

}
