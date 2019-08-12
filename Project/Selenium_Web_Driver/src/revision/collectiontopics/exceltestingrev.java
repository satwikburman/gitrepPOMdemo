package revision.collectiontopics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class exceltestingrev {
	WebDriver driver,driver2,driver3,driver4;
	JavascriptExecutor jsx;
	
	@Test(priority=2)
	public void excelfilecreation() throws IOException {
		FileOutputStream fos=new FileOutputStream(".\\src\\excelrev.xlsx");
		XSSFWorkbook revxlsx=new XSSFWorkbook();
		XSSFSheet TD=revxlsx.createSheet("testdummy");
		XSSFRow R1=TD.createRow(2);
		XSSFCell C1=R1.createCell(4);
		C1.setCellValue("Ronnie");
		revxlsx.write(fos);
		System.out.println(TD.getRow(2).getCell(4));
		System.out.println(TD.getLastRowNum());
		System.out.println("Across a row we get the get last cell number" +R1.getLastCellNum());
		
	}
	
	@Test(priority=3)
	public void fromfile() throws IOException {
		XSSFWorkbook toex=new XSSFWorkbook(".\\src\\excelrev.xlsx");
		XSSFSheet tosheet=toex.getSheet("testdummy");
		XSSFCell tocell=tosheet.getRow(2).getCell(4);
		String value=String.valueOf(tocell);
		System.out.println(value);
		String test=tocell.getStringCellValue(); // We get 0 for get raw cell value.
		System.out.println("Via function " +test);
	}
	//@Test(priority=4)
	@Parameters({"browser","url","password"})
	public void testngparam(String browser,String url,String password) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    System.out.println(browser);
	    System.out.println(url);
	    System.out.println(password);
	    String test[]= {browser,url,password};
	    for(int i=0;i<test.length;i++) {
	    driver.findElement(By.name("q")).clear();
	    driver.findElement(By.name("q")).sendKeys(test[i]);
	    }
	    List<WebElement> brourl=driver.findElements(By.tagName("a"));
	    for(WebElement tocheckurl:brourl) {
	    	String urlpass=tocheckurl.getAttribute("href");
	    	verifyLinkActive(urlpass);
	    	
	    }
	    
	    
	    driver.quit();
	}
	
	@Test(priority=5)
	public void Expwait() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
	    driver2 = new ChromeDriver();
	    driver2.manage().window().maximize();
	    driver2.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	    driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver2.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
	    WebDriverWait wd=new WebDriverWait(driver2, 30);
	    WebElement exptest=wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	    System.out.println("Explicit wait performed");
	    //WebElement exptest=driver2.findElement(By.xpath("//p[text()='WebDriver']"));
	    boolean check=exptest.isDisplayed();
	    System.out.println(check);
	    driver2.quit();
	}
	
	@Test(priority=1)
	public void scrollintoview() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
	    driver3 = new ChromeDriver();
	    driver3.manage().window().maximize();
	    driver3.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	    driver3.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebElement toview=driver3.findElement(By.xpath("//div[@id='mCSB_3_container']//p[contains(text(),'Nemo enim ipsam voluptatem quia voluptas sit asper')]"));
	    jsx=(JavascriptExecutor) driver3;
	    System.out.println(jsx instanceof WebDriver);
	    jsx.executeScript("arguments[0].scrollIntoView(true);", toview);
	    System.out.println(toview.getText());
	    driver3.quit();
			
		
		
	}
	
	@Test(priority=6)
	public void hiddentesting() {
		driver4=new ChromeDriver();
		driver4.manage().window().maximize();
		driver4.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> male=driver4.findElements(By.xpath("//input[@id='male']"));
		int count=male.size();
		for(WebElement radio:male) {
			if(radio.isDisplayed()) {
				radio.click();
			}
		}
		driver4.quit();
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	

}
