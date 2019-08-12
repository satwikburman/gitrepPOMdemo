package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Tracks java class page
public class Trackspage extends menupage {//extending menupage as top navigation bar content is common across all pages

	public Trackspage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//h2[@class='settings-page-header']") WebElement trackstag;
	public String gettracktitle() {
		String trackstitle=trackstag.getText();
		return trackstitle;
	}
	
	@FindBy(how=How.LINK_TEXT, using="Add new Track") WebElement clickonaddnewtracks;
	public void clickonaddtracks() {
		clickonaddnewtracks.click();
		
	}
	
	@FindBy(how=How.ID, using="j_id123:trackDescriptionDecorate:trackDescription") WebElement tname;
	@FindBy(how=How.ID, using="j_id123:trackTagDecorate:trackTag") WebElement ttag;
	@FindBy(how=How.ID, using="j_id123:taskLines:0:taskDescriptionDecorate:taskDescription") WebElement taskname;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Save')]") WebElement savetask;
	public void addnewtracks(String trackname, String tracktag, String tskname) {
		tname.sendKeys(trackname);
		ttag.sendKeys(tracktag);
		taskname.sendKeys(tskname);
		savetask.click();
		
	}

	
}
