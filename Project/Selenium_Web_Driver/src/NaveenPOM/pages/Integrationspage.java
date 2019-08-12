package NaveenPOM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Integration page java class
public class Integrationspage extends menupage { ////extending menupage as top navigation bar content is common across all pages

	WebDriver driver;
	public Integrationspage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	//a[contains(text(),'Configure')]
	
	@FindBy(how=How.XPATH, using="//h2[@class='settings-page-header']") WebElement integrationtag;
	public String getintegrationtitle() {
		String inttitle=integrationtag.getText();
		return inttitle;
	}

	@FindBy(how=How.XPATH, using="//a[contains(text(),'Configure')]") public List<WebElement> buttonlist;
	public void buttoncount() {
		System.out.println(buttonlist.size());
		
	}
}
