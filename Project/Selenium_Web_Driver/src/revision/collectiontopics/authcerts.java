package revision.collectiontopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class authcerts {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testingAuth() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		DesiredCapabilities dp=new DesiredCapabilities();
		dp.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	    driver = new ChromeDriver(dp);
	    driver.manage().window().maximize();
	    driver.get("https://www.cacert.org/");
	    Thread.sleep(15000);
	    driver.quit();
		
		
	}
	
	

}
