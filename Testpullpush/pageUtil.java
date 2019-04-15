package testng.pomnopcom.pages.common;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

public class pageUtil {
	WebDriver driver;
	public pageUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyTitle() {
		System.out.println(driver.getTitle());
		
	}
    public void takeSnapShot() {
    	
    }
    public void isElementPresent() {
    	
    }
}
