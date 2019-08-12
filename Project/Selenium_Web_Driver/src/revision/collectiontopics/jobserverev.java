package revision.collectiontopics;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class jobserverev {
	WebDriver driver;
	
	@BeforeTest
	public void openjobserver() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void closejobserver() {
		driver.close();
	}
	
	@Test
	public void action() throws InterruptedException {
		driver.findElement(By.cssSelector("#ddcl-selInd>span>span")).click();
		Thread.sleep(2000);
		WebElement ischecked=driver.findElement(By.id("ddcl-selInd-i0"));
		boolean check=ischecked.isSelected();
		System.out.println(check);
		if(check) {
			ischecked.click();
		}
		String xs1="ddcl-selInd-i";
		Random r=new Random();
		for(int i=1;i<=6;i++) {
			int z=r.nextInt(27)+1;
			WebElement toclick=driver.findElement(By.id(xs1+z)); //Fetching a random number.
			toclick.click();
		}
		driver.findElement(By.id("txtLoc")).sendKeys("Bangalore");
		WebElement dday=driver.findElement(By.id("selAge"));
		WebElement djob=driver.findElement(By.id("selJType"));
		Select sel1=new Select(dday);
		Select sel2=new Select(djob);
		sel1.selectByIndex(1);
		sel2.selectByValue("1");
		
		driver.findElement(By.id("btnSearch")).submit();
		Thread.sleep(12000);
	}
	

}
