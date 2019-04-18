package testng.pomnopcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import testng.pomnopcom.pages.common.pageUtil;

public class RegPage extends pageUtil {
	
	public RegPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how=How.ID, using="gender-male") WebElement genderSelect;
	@FindBy(how=How.ID, using="FirstName") WebElement firstName;
	@FindBy(how=How.ID, using="LastName") WebElement lastName;
	@FindBy(how=How.NAME, using="DateOfBirthDay") WebElement DOD;
	@FindBy(how=How.NAME, using="DateOfBirthMonth") WebElement DOM;
	@FindBy(how=How.NAME, using="DateOfBirthYear") WebElement DOY;
	@FindBy(how=How.ID, using="Email") WebElement emailID;
	public void fillPersonalDetails(String fname, String lname, String day, String month, String year, String em) {
		genderSelect.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		DOD.click();
		DOD.sendKeys(day);
		DOM.click();
		DOM.sendKeys(month);
		DOY.click();
		DOY.sendKeys(year);
		emailID.sendKeys(em);
		
		
	}
	@FindBy(how=How.ID, using="Company") WebElement companyName;
	@FindBy(how=How.ID, using="Newsletter") WebElement newsLetter;
	public void fillCompOp(String company) {
		companyName.sendKeys("International Business Machines Corp");
		if(newsLetter.isSelected()) {
			newsLetter.click();
			newsLetter.click();
		}
		else {
			newsLetter.click();
		}
		
		
	}
	@FindBy(how=How.ID, using="Password") WebElement passWord;
	@FindBy(how=How.ID, using="ConfirmPassword") WebElement confPass;
	public void fillPassword(String pass, String cpass) {
		passWord.sendKeys(pass);
		confPass.sendKeys(cpass);
		
		
	}
	@FindBy(how=How.XPATH, using="//input[@type='submit'][@id='register-button']") WebElement regSub;
	@FindBy(how=How.NAME, using="register-continue") WebElement Cont;
	@FindBy(how=How.CLASS_NAME, using="ico-logout") WebElement lOut;
	public void clickonSubmit() throws InterruptedException {
		regSub.click();
		Thread.sleep(2000);
		Cont.click();
		lOut.click();
	}

}
