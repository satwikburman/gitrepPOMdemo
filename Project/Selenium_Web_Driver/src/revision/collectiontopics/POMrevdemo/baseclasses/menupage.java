package revision.collectiontopics.POMrevdemo.baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class menupage {
	WebDriver driver;
	
	public menupage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	@FindBy(how=How.XPATH, using="//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][contains(text(),'Catalog')]") WebElement catalog;
	@FindBy(how=How.XPATH, using="//li[@class='leaf has-sub']//span[contains(text(),'Toys')]") WebElement toys;
	public void catalog_toy() {
		Actions act=new Actions(driver);
		act.moveToElement(catalog).build().perform();
		toys.click();
		
	}

}
