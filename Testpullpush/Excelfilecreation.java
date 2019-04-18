package testng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sel.webdrriver.*;

public class Excelfilecreation {
	static WebDriver driver, driver2, driver3,driver4;

	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.americangolf.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	//@Test
	public void f() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		FileOutputStream f = new FileOutputStream(".\\src\\Test.xlsx");// Output stream to create a file
		XSSFSheet xs = wb.createSheet("LoginInfo");
		XSSFSheet xs2 = wb.createSheet("NextTab");
		// wb.write(f);//Saving the content(committing)
		XSSFRow r1 = xs.createRow(1);
		XSSFRow r2 = xs.createRow(3);
		XSSFRow r3 = xs.createRow(8);
		XSSFCell c1 = r1.createCell(2);
		XSSFCell c2 = r1.createCell(0);
		XSSFCell c3 = r2.createCell(2);
		c1.setCellValue(34.8);
		c2.setCellValue(true);
		c3.setCellValue("Trig");
		wb.write(f);
		System.out.println(xs.getLastRowNum());
		System.out.println(xs.getRow(3));
		XSSFCell xc = xs.getRow(1).getCell(2);
		//String test = String.valueOf(xc);
		String test =xc.getRawValue();
		System.out.println("Value of the desired target cell is" + test);

	}

	@Test
	public void actiontest() throws InterruptedException {
		WebElement hovele = driver.findElement(By.cssSelector("div#header-navigation>div:nth-child(1)>ul>li:nth-child(2)>a"));
		Actions hovaction = new Actions(driver);
		hovaction.moveToElement(hovele).build().perform();
		driver.findElement(By.xpath("//div[@id='CLUBS_1']/ul/li[2]/ul/li[2]/a/span")).click();
		// driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[5]/div/div/div[1]/a/i")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		WebElement dand = driver.findElement(By.xpath("//*[@id='footer-wrapper']//preceding::div[@class='noUi-origin'][1]/div"));
		hovaction.dragAndDropBy(dand, -100, 0).build().perform();
		Thread.sleep(4000);

	}

	@Test
	public void configtest() throws IOException {

		FileInputStream f = new FileInputStream(
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\testng\\Test.properties");
		Properties p = new Properties();
		p.load(f);// Saving the property file so
		// that every value can be fetched via the key, it points to the file in the
		// input stream
		System.out.println(p.getProperty("Nation"));

		 System.out.println(sel.webdrriver.Utilib.getprop("Name"));
		System.out.println("Error check");

	}

	 @Test
	
	  public void googlesearch() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",".\\src\\chromedriver.exe");
	  driver4=new ChromeDriver(); 
	  driver4.get("https://www.google.com/"); 
	  driver4.manage().window().maximize();
	  driver4.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver4.findElement(By.name("q")).click();
	  driver4.findElement(By.name("q")).sendKeys("test");
	  List<WebElement> google_sug=driver4.findElements(By.cssSelector("div.aajZCb>ul>li>div>div>div>span>b"));
	  System.out.println(google_sug.size());
	  Thread.sleep(5000);
	  for(int i=0;i<google_sug.size();i++) {
		  if(google_sug.get(i).getAttribute("innerHTML").equalsIgnoreCase("ng")) {
			  WebElement to_click=driver4.findElement(By.cssSelector("div.aajZCb>ul>li>div>div>div>span:nth-child(i)"));
			  to_click.click();
			  break;
		  }
		  
		  System.out.println(google_sug.get(i).getAttribute("innerHTML"));
		  
	  }
	  
	  
	  driver4.quit();
	  
	  
	  }
	 
	@Test
	public void fblogintest() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		driver3 = new ChromeDriver();
		xlsinputstream x1 = new xlsinputstream(".\\src\\TestDemo.xlsx");
		driver3.get("https://www.facebook.com/");
		driver3.manage().window().maximize();
		driver3.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int count = x1.getrowcount("Login");
		for (int i = 2; i <= count; i++) {
			driver3.findElement(By.id("email")).sendKeys(x1.getvalue("Login", i, 1));
			driver3.findElement(By.id("pass")).sendKeys(x1.getvalue("Login", i, 2));
			Thread.sleep(4000);
			driver3.findElement(By.id("email")).clear();
			driver3.findElement(By.id("pass")).clear();

		}
		driver3.quit();

	}

	@Test
	public void googlescroll() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		driver2 = new ChromeDriver();
		driver2.get("https://www.google.com/");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.findElement(By.name("q")).sendKeys("Text");
		driver2.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver2.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver2.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver2.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver2.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver2.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		driver2.quit();

	}

	//@AfterTest
	public void closebrowser() {
		driver.quit();

	}
}
