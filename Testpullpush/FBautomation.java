package sel.webdrriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBautomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("peripherysatwik@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("IncurableInsanity_2628");
        driver.findElement(By.id("u_0_2")).submit();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        //Waiting so that next menu becomes visible before browser session closing
        driver.findElement(By.xpath("//*[@id='logoutMenu']/a/div")).click(); //By rel xpath
        //driver.findElement(By.id("userNavigationLabel")).click(); //By ID
        //List<WebElement> fbddown=driver.findElements(By.xpath("//*[@id='js_9r']/div/div/ul/li/a/span/span[1]"));
		
		/*
		 * for(int i=0;i<fbddown.size();i++) {
		 * if(fbddown.get(i).getText().equalsIgnoreCase("log out")) {
		 * fbddown.get(i).click(); System.out.println("Login was successfull");
		 * 
		 * } System.out.println(fbddown.get(i).getText()); }
		 */
        String home_xpath="//*[@id='u_0_c']/a";
		 
        Thread.sleep(5000);
        driver.quit();
	}

}
