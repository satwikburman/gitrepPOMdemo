package sel.webdrriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablemanupulation {
	public static  WebDriver driver,driver1;
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.borland.com/gmopost/");
		driver.findElement(By.name("bSubmit")).click();
		WebElement tabele=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody"));
		//Capturing the entire table as a single consolidated web element.
		List<WebElement> lwe=tabele.findElements(By.xpath("tr"));// Each web element in the list contains a single row
		System.out.println("The number of rows the table is having " +lwe.size());
		for(WebElement tabcon:lwe) {
			List<WebElement> tabrow=tabcon.findElements(By.xpath("td"));
			for(WebElement tabdata:tabrow) {
				System.out.print(tabdata.getText() + " ");
			}
			System.out.println(" ");
		}
		List<WebElement> search=driver.findElements(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[1]"));
		List<WebElement> value=driver.findElements(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[3]"));
		int product=1005;
		String pro=Integer.toString(product);
		System.out.println(pro);
		
		for(int i=0;i<search.size();i++) {
			if(search.get(i).getText().equals(pro)) {
				System.out.println(" Corresponding value would be" +value.get(i).getAttribute("innerHTML"));
			}
		}
		driver.quit();
		
		System.out.println("************NEW DRIVER INSTANCE**********************");
		
		driver1=new ChromeDriver();
		
		driver1.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver1.manage().window().maximize();
		List<WebElement> company=driver1.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		List<WebElement> cprice=driver1.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		/*
		 * for(int i=0;i<company.size();i++) {
		 * if(company.get(i).getText().equals("Welspun Corp")) {
		 * System.out.println("For WelSpun corp the current stock price is: "
		 * +cprice.get(i).getText()); } }
		 */
		validation(company,cprice,"Welspun Corp");
		driver1.quit();
		
		
		

	}
	
	public static void validation(List a,List b,String c) {
		for(int i=0;i<a.size();i++) {
			if(((WebElement) a.get(i)).getText().equals(c)) {
				System.out.println("For WelSpun corp the current stock price is: " +((WebElement) b.get(i)).getText());
			}
		}
		
	}

}
