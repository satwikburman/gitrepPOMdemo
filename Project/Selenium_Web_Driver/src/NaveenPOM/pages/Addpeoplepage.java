package NaveenPOM.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import NaveenPOM.commonactions.menupage;

//Add people java class page.
public class Addpeoplepage extends menupage{ ////extending menupage as top navigation bar content is common across all pages

	WebDriver driver;
	public Addpeoplepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	@FindBy(how=How.CSS, using="div.page-header-right>a:nth-child(1)") WebElement addpep;
	public void clickonaddperson() {
		addpep.sendKeys(Keys.ENTER);
		
	}
	
	
	
	@FindBy(how=How.XPATH, using="//*[@name='party:j_id108:j_id116']") WebElement per_title;
	@FindBy(how=How.ID, using="party:fnDecorate:fn") WebElement firstname;
	@FindBy(how=How.ID, using="party:lnDecorate:ln") WebElement lastname;
	@FindBy(how=How.ID, using="party:roleDecorate:jobTitle") WebElement jobtitle;
	@FindBy(how=How.ID, using="party:orgDecorate:org") WebElement org;
	@FindBy(how=How.ID, using="party:tagsDecorate:tagComboBox") WebElement tags;
	@FindBy(how=How.ID, using="party:tagsDecorate:j_id187") WebElement clickonaddtag;
	@FindBy(how=How.ID, using="party:j_id325:0:phnDecorate:number") WebElement phonenumber;
	@FindBy(how=How.ID, using="party:j_id342:0:emlDecorate:nmbr") WebElement emailid;
	@FindBy(how=How.ID, using="party:save") WebElement save;
	public void addperson(String fname,String lname,String JT,String Org,String tags,String phnno,String email) {
		
		
		Select sel=new Select(per_title);
		sel.selectByValue("Mr");
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		jobtitle.sendKeys(JT);
		org.sendKeys(Org);
		this.tags.sendKeys(tags);
		clickonaddtag.click();
		phonenumber.sendKeys(phnno);
		emailid.sendKeys(email);
		save.click();
		
		
		
	}
}
