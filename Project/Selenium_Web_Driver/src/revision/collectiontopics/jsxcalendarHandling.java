package revision.collectiontopics;



import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsxcalendarHandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		int testpoint=driver.manage().window().getPosition().getX();
		String toset= "Wed, 17 Jul";
		driver.get("https://m.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement checkingdate=driver.findElement(By.xpath("//div[@data-testid='search-renderDatesText' and @class='css-76zvg2 r-jwli3a r-1i10wst r-majxgm r-15zivkp']"));
		String currentdefaultdate=checkingdate.getAttribute("innerHTML");
		System.out.println("Default date popping up is: " +currentdefaultdate);
		JavascriptExecutor jsx=(JavascriptExecutor) driver;
		jsx.executeScript("arguments[0].setAttribute('textContent','"+toset+"');", checkingdate);
		//jsx.executeScript("document.getElementByXpath('//div[@data-testid='search-renderDatesText' and @class='css-76zvg2 r-jwli3a r-1i10wst r-majxgm r-15zivkp']').innerHTML = 'Wed, 17 Jul'", checkingdate);
		WebElement checkingdatepost=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-13qz1uu']/div/div"));
		System.out.println(checkingdatepost.getText());
		Thread.sleep(6000);
		//document.getElementById('test').innerHTML = 'Wed, 17 Jul';
		//jsx.executeScript("document.getElementByXpath('//div[@data-testid='search-renderDatesText' and @class='css-76zvg2 r-jwli3a r-1i10wst r-majxgm r-15zivkp']').textContent='"+toset+"';");
		//driver.quit();
	}
}