package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Export page java class
public class Exportpage extends menupage { //extending menupage as top navigation bar content is common across all pages
	
	public Exportpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how=How.XPATH, using="//h1[@class='settings-page-header']") WebElement exporttag;
	public String getexporttitle() {
		String exporttitle=exporttag.getText();
		return exporttitle;
	}

}
