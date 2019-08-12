package testng.pomnopcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testng.pomnopcom.pages.common.pageUtil;

public class LoginPage extends pageUtil {
	
	WebDriver driver;
	

public LoginPage(WebDriver driver) {
	
	
	super(driver);
	//System.out.println("Default Login Page cons");
	this.driver=driver;
	
}



@FindBy(how=How.ID, using="Email") WebElement logName;
@FindBy(how=How.ID, using="Password") WebElement logPass;

public void retCust(String uname, String pass) {
	logName.sendKeys(uname);
	logPass.sendKeys(pass);
	
	
}
@FindBy(how=How.XPATH, using="//input[@value='Log in']") WebElement logIn;
public void clickLoginSubmit() {
	
	logIn.click();
}

}
