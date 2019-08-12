package NaveenPOM.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Add case page class

public class Addcasepage extends menupage{ //extending menupage as top navigation bar content is common across all pages
	WebDriver driver;

	public Addcasepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
    @FindBy(how=How.LINK_TEXT, using="Add Case") WebElement addcase;
	public void clickonaddcase() {
		addcase.click();
		
	}
	
	@FindBy(how=How.ID, using="partySearch") WebElement caserelto;
	@FindBy(how=How.ID, using="caseNameDecorate:name") WebElement casename;
	@FindBy(how=How.ID, using="caseDescriptionDecorate:description") WebElement casedesc;
	@FindBy(how=How.ID, using="tagsDecorate:tagComboBox") WebElement casetags;
	@FindBy(how=How.ID, using="save") WebElement casesubmit;
	public void createcase(String crt, String cn,String cd,String ct) throws InterruptedException {
		caserelto.sendKeys(crt);
		caserelto.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		caserelto.sendKeys(Keys.DOWN);
		Thread.sleep(4000);
		caserelto.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		casename.sendKeys(cn);
		casedesc.sendKeys(cd);
		casetags.sendKeys(ct);
		casesubmit.click();
		
	}
}
