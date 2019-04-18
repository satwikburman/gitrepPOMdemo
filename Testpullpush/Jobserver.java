package sel.webdrriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jobserver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtKey")).sendKeys("Automation");
		driver.findElement(By.id("txtLoc")).sendKeys("Bangalore");
		WebElement e1=driver.findElement(By.id("selAge"));
		WebElement e2=driver.findElement(By.id("selJType"));
		Select d_sel1=new Select(e1);
		Select d_sel2=new Select(e2);
		d_sel1.selectByValue("6");
		WebElement selected1=d_sel1.getFirstSelectedOption();
		System.out.println(selected1.getText());
		d_sel2.selectByVisibleText("Permanent");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement selected2=d_sel2.getFirstSelectedOption();
        System.out.println(selected2.getText());
        driver.findElement(By.xpath("//*[@id='ddcl-selInd']/span")).click();
        WebElement isclicked=driver.findElement(By.xpath("//*[@id='ddcl-selInd-ddw']/div[1]/div[1]/label"));
        boolean test=isclicked.isEnabled();
        System.out.println(test);
        if(test){
        	isclicked.click();
        }
        String s1="//*[@id=\"ddcl-selInd-i";
        String s3="\"]";
        for(int i=9;i<=15;i++) {
        	
        	driver.findElement(By.xpath(s1+i+s3)).click();
        	
        }
        int arr[]= {3,7,6,12,20,4,11};
        for(int i=0;i<arr.length;i++) {
        	driver.findElement(By.xpath(s1+arr[i]+s3)).click();
        }
        driver.findElement(By.id("hdnType")).submit();
        Thread.sleep(7000);
        
        driver.quit();
	}

}
