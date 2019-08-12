package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Mail drop box java class
public class Maildropbox extends menupage {//extending menupage as top navigation bar content is common across all pages

	public Maildropbox(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//h2[@class='settings-page-header']") WebElement mdbtag;
	public String returnmdbtitle() {
		String mdbtitle=mdbtag.getText();
		return mdbtitle;
	}

}
