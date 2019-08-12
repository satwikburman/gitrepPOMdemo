package NaveenPOM.baseactions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This class has got browser declared and also methods containing code that has defined browser start and also browser quit post completion of a desired test-case
//The choice of browser is getting deployed based on the input which is being taken from the TestData property file.

public class browserbase extends snapshotandgetprop {
	
	public WebDriver driver;
	public String browsername=getProp("browser");
	public void launch(String url) { //Launching browser by taking in input from the browser value inside the test data properties file.
		if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			/*
			 * try { driver.wait(); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			}
			else {
				System.out.println("Not in realm");
			}
	}
	
	public void crash() { //Closing the already launched browser.
		driver.quit();
	}

}
