package sel.webdrriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GMOTesting {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String T1 = driver.getTitle();
		System.out.println("Title of the Webpage one is: " + T1);
		driver.findElement(By.xpath("/html/body/form/div[1]/center/table/tbody/tr/td[1]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("QTY_TENTS")).clear();
		driver.findElement(By.name("QTY_TENTS")).sendKeys("10");
		//Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[4]/td[4]/h1/input"))
				.clear();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[4]/td[4]/h1/input"))
				.sendKeys("8");
		driver.findElement(By.name("QTY_BOOTS")).clear();
		driver.findElement(By.name("QTY_BOOTS")).sendKeys("15");
		String T2 = driver.getTitle();
		System.out.println("Title of the Webpage two is: " + T2);
		driver.findElement(By.name("QTY_SHORTS")).clear();
		driver.findElement(By.name("QTY_SHORTS")).sendKeys("25");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/div/center/table/tbody/tr/td/p/input[2]"))
				.click();
		String T3 = driver.getTitle();
		System.err.println("Title of third Webpage is" + T3);
		driver.findElement(By.name("bSubmit")).click();
		String T4 = driver.getTitle();
		System.out.println("Title of Order details page is: " + T4);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/input")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("Ivan Rak");
		driver.findElement(By.name("billAddress")).click();
		driver.findElement(By.name("billAddress")).sendKeys("First cross Catalonia Junction");
		driver.findElement(By.name("billCity")).click();
		driver.findElement(By.name("billCity")).sendKeys("Barcelona");
		driver.findElement(By.name("billState")).click();
		driver.findElement(By.name("billState")).sendKeys("Spain");
		driver.findElement(By.name("billZipCode")).click();
		driver.findElement(By.name("billZipCode")).sendKeys("56016");
		String validation = driver.findElement(By.name("billZipCode")).getAttribute("value");// When something is
																								// entered it gets
																								// stored in value tag
		System.out.println(validation);
		if (validation.length() == 5) {
			System.out.println("Test passed for Pin code");
		} else {
			System.out.println("Failed test for Pin code");
		}
		driver.findElement(By.name("billPhone")).click();
		driver.findElement(By.name("billPhone")).sendKeys("8453567659");
		String validation2 = driver.findElement(By.name("billPhone")).getAttribute("value");
		if (validation2.length() == 10) {
			System.out.println("Test passed for Phone number");
		} else {
			System.out.println("Failed test for Phone number");
		}
		driver.findElement(By.name("billEmail")).click();
		driver.findElement(By.name("billEmail")).sendKeys("IR@gmail.com");
		WebElement WE = driver.findElement(By.name("CardType"));
		Select dropdown_select = new Select(WE);
		WebElement ddown=dropdown_select.getFirstSelectedOption();
		System.out.println("Before selecting value would be" +ddown.getAttribute("innerHTML"));
		dropdown_select.selectByVisibleText("MasterCard");//Selecting from drop down
		WebElement dropdown_valid = dropdown_select.getFirstSelectedOption();// Checking selected value from drop down
		String test = dropdown_valid.getText();// Get text returns inner text
		System.out.println("Selected from dropdown is" + test);

		driver.findElement(By.name("CardNumber")).click();
		driver.findElement(By.name("CardNumber")).sendKeys("1234123412341234");
		driver.findElement(By.name("CardDate")).click();
		driver.findElement(By.name("CardDate")).sendKeys("09/22");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[3]/table/tbody/tr[1]/td[2]/input")).click();
		List<WebElement> LWE=dropdown_select.getOptions();
		for(WebElement we:LWE) {
			System.out.println(we.getText());
		}
		// driver.findElement(By.name("CardType")).click();
		driver.findElement(By.name("bSubmit")).submit();
		
		

		Thread.sleep(15000);
		driver.quit();

	}

}
