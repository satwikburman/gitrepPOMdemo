package testng.pomnopcom.pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MenuPage {
	WebDriver driver;
	public MenuPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how=How.CLASS_NAME, using="ico-login") WebElement clikcLoin;
	public void doLogin() {
		clikcLoin.click();
	}
	
	@FindBy(how=How.XPATH, using="//*[@id='bar-notification']//following::div[1]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a") WebElement regLink;
	public void clickReg() {
		regLink.click();
		}
	@FindBy(how=How.ID, using="small-searchterms") WebElement search;
	@FindBy(how=How.CSS, using="input[type='submit']") WebElement searchbutton;
	public void doSearch(String searchval) {
		search.click();
		search.sendKeys(searchval);
		searchbutton.submit();
		
	}
	@FindBy(how=How.ID, using="customerCurrency") WebElement cur_ddown;
	public void changecurrency(String selected_val) {
		Select sel=new Select(cur_ddown);
		sel.selectByVisibleText(selected_val);
	}
    
	@FindBy(how=How.CLASS_NAME, using="ico-wishlists") WebElement wishlist;
	public void wishList() {
		wishlist.click();
		
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Shopping cart')]") WebElement scart;
	public void gotoCart() {
		Actions a=new Actions(driver);
		a.moveToElement(scart).click(scart).build().perform();
	}
	
	@FindBy(how=How.XPATH, using="//img[@alt='nopCommerce demo store']") WebElement NOPCommLogo;
	public void gotoHome() {
		NOPCommLogo.click();
	}
	
	@FindBy(how=How.XPATH, using="//div[@class='header-menu']/ul[1]/li[1]/a") WebElement computer;
	public void gotoComputer() {
		computer.click();
	}
	
	@FindBy(how=How.XPATH, using="//div[@class='header-menu']/ul[1]/li[2]/a") WebElement electronics;
    public void gotoElectronics() {
    	electronics.click();
		
	}
    @FindBy(how=How.XPATH, using="//div[@class='header-menu']/ul[1]/li[3]/a") WebElement apparel;
    public void gotoApparel() {
		apparel.click();
	}
    
    @FindBy(how=How.XPATH, using="//div[@class='header-menu']/ul[1]/li[4]/a") WebElement digidown;
    public void gotoDigidownloads() {
		digidown.click();
	}
     
    @FindBy(how=How.XPATH, using="//div[@class='header-menu']/ul[1]/li[5]/a") WebElement books;
    public void gotoBooks() {
		books.click();
	}
    
    @FindBy(how=How.XPATH, using="//div[@class='header-menu']/ul[1]/li[6]/a") WebElement jewel;
    public void gotoJewel() {
		jewel.click();
	}
    
    @FindBy(how=How.XPATH, using="//div[@class='header-menu']/ul[1]/li[7]/a") WebElement gc;
    public void gotoGiftcard() {
		
    	gc.click();
	}
}
