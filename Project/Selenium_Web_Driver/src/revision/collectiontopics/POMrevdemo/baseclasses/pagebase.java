package revision.collectiontopics.POMrevdemo.baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pagebase {
	WebDriver driver;
	menupage mp;

	public pagebase(WebDriver driver) {
		this.driver=driver;
		mp=PageFactory.initElements(driver, menupage.class);
		
	}
	
	public menupage getit() {
		return mp;
	}
	
	public void gettitle() {
		System.out.println("Title is "+driver.getTitle());
	}

}
