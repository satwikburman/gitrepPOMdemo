package revision.collectiontopics.POMrevdemo.basefunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class revbasebrowseractions extends revpropsanpshot{
	public WebDriver driver;
	
	public void launch(String url) {
		if(revreadingprop("browser").equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
		else {
			System.out.println("Not in domain");
		}
	}
	
	public void crash() {
		driver.quit();
	}

}
