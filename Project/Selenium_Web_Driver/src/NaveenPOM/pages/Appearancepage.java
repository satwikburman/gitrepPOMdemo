package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Appearance java class page.
public class Appearancepage extends menupage { //extending menupage as top navigation bar content is common across all pages

	public Appearancepage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//h1[@class='settings-page-header']") WebElement appearancetag;
	public String getappearancetitle() {
		String apptitle=appearancetag.getText();
		return apptitle;
	}
	
	@FindBy(how=How.XPATH, using="//input[@type='file']") WebElement logoupload;
	@FindBy(how=How.XPATH, using="//a[@href='#'][@class='btn-primary singlesubmit']") WebElement save;
	public void uploadlogo() {
		String user_dir=System.getProperty("user.dir");
		logoupload.sendKeys(user_dir+"\\src\\thumblogo.png");
		save.click();
		
	}
	
	

}
