package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Invoice java class
public class Invoicepage extends menupage { //extending menupage as top navigation bar content is common across all pages

	
	public Invoicepage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how=How.XPATH, using="//header[@class='page-box-header']") WebElement invoicetag;
	public String getinvoicetitle() {
		String invoicetitle=invoicetag.getText();
		return invoicetitle;
	}
	
	
}
