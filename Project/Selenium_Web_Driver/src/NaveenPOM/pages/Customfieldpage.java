package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

// Custom field java class
public class Customfieldpage extends menupage { ////extending menupage as top navigation bar content is common across all pages

	public Customfieldpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//h2[@class='settings-page-header']") WebElement cftitle;
	public String getcustomfieldtitle() {
		String cftit=cftitle.getText();
				return cftit;
	}

}
