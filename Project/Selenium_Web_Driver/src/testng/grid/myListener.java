package testng.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class myListener extends AbstractWebDriverEventListener {
	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Click happened");
	
	}
	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Backward navigation successfull");
	}
	

}
