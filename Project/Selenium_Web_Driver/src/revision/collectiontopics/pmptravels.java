package revision.collectiontopics;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class pmptravels {
	
	@Test
	public void test2darray() {
		int [][] arr=new int[2][3];
		arr[1][2]=9;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		String test="Test";
		test="Gsphalt";
		test=test+"gs";
		System.out.println(test);
	}
	
	@Test
	public void phptravel() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
		ChromeOptions cop=new ChromeOptions();
		cop.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * List<WebElement> numberof_frames=driver.findElements(By.tagName("iframe"));
		 * System.out.println("Number of frames in the DOM "+numberof_frames.size());
		 */
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String total_text=js.executeScript("return document.documentElement.innerText").toString();
		//System.out.println(total_text); //Entire text of the web page captured.
		String after_total_trim=total_text.trim();
		//System.out.println(after_total_trim); // After trimming the characters down.
		String arrnew[]=after_total_trim.split(" ");
		System.out.println("Length of the new string " +arrnew.length);
		List<String> L1=new ArrayList<String>();
		for(int i=0;i<arrnew.length;i++) {
			 if((arrnew[i].isEmpty()==false)||(arrnew[i].contains(" ")==false)) {
				 String tolower=arrnew[i].toLowerCase();
				 L1.add(tolower);
			 }
		}
		
		String[] arrnewtwo=L1.toArray(new String[L1.size()]);
		for(int j=0;j<arrnewtwo.length;j++) {
			System.out.println(arrnewtwo[j]);
		}

		System.out.println("******************************");
		//To find the frequency of app
		
		int increment=0;
		for (int i=0;i<arrnewtwo.length-1;i++) {
			                       
			for (int j=i+1;j<arrnewtwo.length;j++) {
				
				
				 
				if((arrnewtwo[i].equals(arrnewtwo[j])) && (i!=j) && arrnewtwo[j].equals("kwd")) {
					
					System.out.println(arrnewtwo[j]);
					++increment;
					
				}
				
			}
			  
		}
		
		System.out.println("Number of times gbp was there is: " +increment);
		
		
		
		
		List<WebElement> todismiss=driver.findElements(By.xpath("//iframe[@src='about:blank']"));
		System.out.println(todismiss.size());
		WebElement hotel_option=driver.findElement(By.cssSelector("ul[class='nav nav-tabs RTL nav-justified']>li:nth-child(1)"));
		hotel_option.click();
		WebElement destination=driver.findElement(By.xpath("//div[@id='s2id_autogen3']/a/span[1]"));
		/*
		 * JavascriptExecutor jsx=(JavascriptExecutor) driver;
		 * jsx.executeScript("arguments[0].click()", destination);
		 */
		destination.click();
		
		
		driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys("Green");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='checkin']")).click();
		String checkin_header=driver.findElement(By.xpath("//div[@id='cookyGotItBtnBox']//following::div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
		System.out.println(checkin_header);
		break1:
		while(!checkin_header.isEmpty()) {
			String check=driver.findElement(By.xpath("//div[@id='cookyGotItBtnBox']//following::div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if(check.equalsIgnoreCase("October 2019")!=true) {
				driver.findElement(By.xpath("//div[@id='cookyGotItBtnBox']//following::div[2]/div[1]/table/thead/tr[1]/th[3]")).click();
			}
			else {
				driver.findElement(By.xpath("//div[@id='cookyGotItBtnBox']//following::div[2]/div[1]/table/tbody/tr[1]/td[3]")).click();
				break break1;
			}
			
			
		}
		
		
		Thread.sleep(4000);
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		driver.quit();
		
		//html/body/div[10]/div[1]/table/thead/tr[1]/th[2]
		//div[@id='cookyGotItBtnBox']//following::div[2]/div[1]/table/thead/tr[1]/th[1] //Previous
		//div[@id='cookyGotItBtnBox']//following::div[2]/div[1]/table/thead/tr[1]/th[2] //Month and year
		//div[@id='cookyGotItBtnBox']//following::div[2]/div[1]/table/thead/tr[1]/th[3] //Next
		//div[@id='cookyGotItBtnBox']//following::div[2]/div[1]/table/tbody/tr[1]/td[3] //First of that month
	}

}
