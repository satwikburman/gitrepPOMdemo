package NaveenPOM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import NaveenPOM.commonactions.menupage;

//Task category java class
public class Taskcategorypage extends menupage {//extending menupage as top navigation bar content is common across all pages

	public Taskcategorypage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(how=How.XPATH, using="//h2[@class='settings-page-header']") WebElement taskcattag;
	public String gettaskcattitle() {
		String taskcattitle=taskcattag.getText();
		return taskcattitle;
	}
	
	@FindBy(how=How.LINK_TEXT, using="Add new Category") WebElement clickonanc;
	public void clickonaddnewcat() {
		clickonanc.click();
	}

	@FindBy(how=How.ID, using="editCategoryForm:taskCategoryNameDecorate:taskCategoryName") WebElement tcname;
	@FindBy(how=How.ID, using="editCategoryForm:j_id175") WebElement savetc;
	public void addtaskcategory(String taskcatname) {
		tcname.sendKeys(taskcatname);
		savetc.click();
	}
}
