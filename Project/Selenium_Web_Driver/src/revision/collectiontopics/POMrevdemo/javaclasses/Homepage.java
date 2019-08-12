package revision.collectiontopics.POMrevdemo.javaclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import revision.collectiontopics.POMrevdemo.baseclasses.pagebase;

public class Homepage extends pagebase {
	
	WebDriver driver;
	public Homepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	
    @FindBy(how=How.XPATH, using="//main[@id='main']//following::span[2]") WebElement endemo;
	public void Enterdemo() {
		endemo.click();
		
	}
}
