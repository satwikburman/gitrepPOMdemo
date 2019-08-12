package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Login page java class
public class Loginpage extends menupage { //extending menupage as top navigation bar content is common across all pages
	
	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.ID, using="login:usernameDecorate:username") WebElement uname;
	@FindBy(how=How.ID, using="login:passwordDecorate:password") WebElement password;
	@FindBy(how=How.ID, using="login:login") WebElement login_submit;
	public void doLogin(String user_name, String pass) {
		uname.sendKeys(user_name);
		password.sendKeys(pass);
		login_submit.click();
		
		}

}
