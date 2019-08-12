package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Opportunities page java class
public class Opportunitiespage extends menupage {//extending menupage as top navigation bar content is common across all pages

	public Opportunitiespage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//header[@class='page-box-header']") WebElement oppstag;
	public String getopptitle() {
		String oppstitle=oppstag.getText();
		return oppstitle;
		
	}

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Add new Milestone')]") WebElement addmilestone;
	public void clickonmilestone() {
		addmilestone.click();
		
	}
	
	@FindBy(how=How.XPATH, using="//input[@class='form-input-text milestone-modal-name']") WebElement name;
	@FindBy(how=How.XPATH, using="//textarea[@class='form-input-text milestone-modal-description']") WebElement desc;
	@FindBy(how=How.XPATH, using="//input[@class='form-input-text milestone-modal-probability']") WebElement pow;
	@FindBy(how=How.XPATH, using="//input[@class='form-input-text milestone-modal-days-until-stale']") WebElement dus;
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Save')]") WebElement savemilestone;
	public void addmilestone(String name,String desc,String POW,String DUS) throws InterruptedException {
		this.name.sendKeys(name);
	    this.desc.sendKeys(desc);
	    pow.sendKeys(POW);
	    dus.sendKeys(DUS);
	    savemilestone.click();
	    Thread.sleep(5000);
		
	}
}
