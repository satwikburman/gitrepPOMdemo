package revision.collectiontopics;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

@Listeners(revision.collectiontopics.Itestlischeck.class)
public class google {

	@Test
	public void Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		EventFiringWebDriver efd=new EventFiringWebDriver(driver);
		Mylistenerrev ml=new Mylistenerrev();
		efd.register(ml);
		efd.manage().window().maximize();
		efd.get("https://www.google.com/");
		efd.navigate().refresh();
		Thread.sleep(6000);
		Dimension p=efd.manage().window().getSize();
		System.out.println(p);
		efd.quit();
		
	}

}
