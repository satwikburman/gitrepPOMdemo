package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//user page java class
public class Userpage extends menupage {//extending menupage as top navigation bar content is common across all pages

	public Userpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(how=How.XPATH, using="//h2[@class='settings-page-header']") WebElement usertag;
	public String getusertitle() {
		String usertitle=usertag.getText();
		return usertitle;
	}
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Add new User')]") WebElement adduser;
	public void clickonaddnewuser() {
		adduser.click();
	}
	
	@FindBy(how=How.ID, using="register:save") WebElement submituser;
	@FindBy(how=How.ID, using="register:firstnameDecorate:firstName") WebElement fnamenu;
	@FindBy(how=How.ID, using="register:lastNameDecorate:lastName") WebElement lnamenu;
	@FindBy(how=How.ID, using="register:emailDecorate:email") WebElement emailnu;
	@FindBy(how=How.ID, using="register:usernameDecorate:username") WebElement unamenu;
	public void addnewuser(String firstname, String lastname, String emailid, String username) {
		fnamenu.sendKeys(firstname);
		lnamenu.sendKeys(lastname);
		emailnu.sendKeys(emailid);
		unamenu.sendKeys(username);
		submituser.click();
		
		
	}
}
