package testng.pomnopcom.pages.common;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageUtil {
	MenuPage mp; //Aggregation
	WebDriver driver;
	public pageUtil(WebDriver driver) {
		this.driver=driver;
		mp=PageFactory.initElements(driver, MenuPage.class); //Passing same driver instance to menupage
	}
	
	public MenuPage getMenu() {
		return mp;
	}
	public void verifyTitle() {
		System.out.println(driver.getTitle());
		
	}

	/*
	 * public void takeSnapShot() {
	 * 
	 * 
	 * }
	 */
    public boolean isElementPresent(String xpath) {
    	int test=driver.findElements(By.xpath(xpath)).size();
    	if(test>0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
}
