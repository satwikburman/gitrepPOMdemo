package testng.pomnopcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testng.pomnopcom.pages.common.pageUtil;

public class LoginPage extends pageUtil {

public LoginPage(WebDriver driver) {
	//System.out.println("Default Login Page cons");
	super(driver);
	
}


@FindBy(how=How.CLASS_NAME, using="ico-login") WebElement clikcLoin;
public void doLogin() {
	clikcLoin.click();
}
@FindBy(how=How.ID, using="Email") WebElement logName;
@FindBy(how=How.ID, using="Password") WebElement logPass;
@FindBy(how=How.XPATH, using="//input[@value='Log in']") WebElement logIn;
public void retCust(String uname, String pass) {
	logName.sendKeys(uname);
	logPass.sendKeys(pass);
	logIn.click();
}

}
