package revision.collectiontopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tabhandlingrev {
	public WebDriver driver,driver2;
	
	@BeforeTest
	public void browserstart() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.borland.com/gmopost/");
		}
	@AfterTest
	public void browserclose() {
		driver.quit();
	}
	
	@Test
	public void tabhandling() {
		driver.findElement(By.name("bSubmit")).click();
        WebElement fulltab=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody"));
        List<WebElement> tabrow=fulltab.findElements(By.xpath("tr"));
        for(WebElement tabcol:tabrow) {
        	List<WebElement> tabdata=tabcol.findElements(By.xpath("td"));
        	for(WebElement cell:tabdata) {
        		System.out.print(cell.getText());
        	}
        	System.out.println(" ");
        }
	}
	
	@Test
	public void gettabdata() {
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
		driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> search=driver2.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		List<WebElement> value=driver2.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		System.out.println("Length of search"+search.size());
		System.out.println("Length of value"+value.size());
		for(int i=0;i<search.size();i++) {
			if(search.get(i).getText().equalsIgnoreCase("L&T")) {
				System.out.println(value.get(i).getText());
				break;
			}
		}
		System.out.println(driver2.manage().logs()); //To get logs
		Actions a=new Actions(driver2);
		a.doubleClick();
		driver2.quit();
		}
	}


