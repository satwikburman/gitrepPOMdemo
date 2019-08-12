package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//trash page class
public class Trashpage extends menupage {//extending menupage as top navigation bar content is common across all pages

	public Trashpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//h2[@class='settings-page-header']") WebElement trashtags;
	public String gettrashtitle() {
		String trashtitle=trashtags.getText();
		return trashtitle;
	}

}
