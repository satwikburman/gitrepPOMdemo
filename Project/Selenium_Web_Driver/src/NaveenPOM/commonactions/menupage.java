package NaveenPOM.commonactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import NaveenPOM.baseactions.leftaccountsmenu;

//menupage is a class that has all the functionalities deployed which is there on the navigation bar tab and is common across all the pages. Writing this code underneath all the individual
//java classes would make unnecessary redundant coding blocks, so the same file is extended by every java page classes and the webdriver instance is shared across this class from each and every 
//java class by using the super(driver) keyword as every java class is getting the WebDriver instance passed to it's constructor from the test-cases by Page Factory.

public class menupage {
	
	leftaccountsmenu LAM; // Aggregating leftaccountsmenu inside menupage.
	WebDriver driver;

	public menupage(WebDriver driver) { //Passing WebDriver instance to the aggregation of leftaccountsmenu which bears a has a relationship.
		this.driver=driver;
		LAM=PageFactory.initElements(driver, leftaccountsmenu.class);
	}
	
	public leftaccountsmenu getleftaccmenu() { //In order to access menupage contents we must call this method that returns the object of leftaccountsmenu.
		return LAM;
	}
	public void clickonaddpeople() { //clicks on addpeople icon
		//boolean val1;
		WebElement clickpep=driver.findElement(By.xpath("//*[@class='nav-bar']/div/nav/span[2]/a"));
		clickpep.click();
		
		
	}
	
	public void clickonhome() { //clicks on home icon
		//boolean val2;
		WebElement clickhome=driver.findElement(By.xpath("//*[@class='nav-bar']/div/nav/span[1]/a"));
		clickhome.click();
		
		
	}
	
	public void clickoncase() { //clicks on case icon.
		driver.findElement(By.xpath("//*[@class='nav-bar']/div/nav/span[5]/a")).click();
		
	}
	
	public void clickonaccount() { //clicks on account settings page.
		driver.findElement(By.xpath("//span[@class='nav-bar-username']")).click();
		driver.findElement(By.xpath("//div[@role='listbox']/a[2]")).click();
	}

}
