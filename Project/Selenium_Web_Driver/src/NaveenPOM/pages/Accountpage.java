package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Account page class
public class Accountpage extends menupage{ //extending menupage as top navigation bar content is common across all pages

	public Accountpage(WebDriver driver) { 
		super(driver);
		
	}
	@FindBy(how=How.XPATH, using="//span[@class='settings-content-menu-title']") WebElement accounttag;
	public String getaccounttitle() {
		String acctitle=accounttag.getText();
		return acctitle;
		
	}
	
	
}
