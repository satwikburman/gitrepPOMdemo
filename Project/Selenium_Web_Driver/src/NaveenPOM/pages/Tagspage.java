package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Tags java class
public class Tagspage extends menupage { ////extending menupage as top navigation bar content is common across all pages

	public Tagspage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//h2[@class='settings-page-header']") WebElement tagstitle;
	public String gettagstitle() {
		String tagstit=tagstitle.getText();
		return tagstit;
		
	}
	
	@FindBy(how=How.LINK_TEXT, using="Add new Tag") WebElement coant;
	public void clickonaddnewtag() {
		coant.click();
	}
	
	@FindBy(how=How.ID, using="j_id177:tagNameDecorate:tagName") WebElement tagname;
	@FindBy(how=How.ID, using="j_id177:j_id210") WebElement savetagname;
	public void addnewtag(String tag_name) {
		tagname.sendKeys(tag_name);
		savetagname.click();
	}

}
