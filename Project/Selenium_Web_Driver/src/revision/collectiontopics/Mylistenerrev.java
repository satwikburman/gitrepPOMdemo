package revision.collectiontopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class Mylistenerrev extends AbstractWebDriverEventListener {
	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("Checking the functionality");
	}

}
