package NaveenPOM.baseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class leftaccountsmenu {
	
	WebDriver driver;
	
	public leftaccountsmenu(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Account() { //clicking on account.
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[1]/a")).click();
	}
	
	public void Invoices() { //clicking on invoices.
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[2]/a")).click();
	}
	
	public void Export() { //clicking on export.
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[3]/a")).click();
	}
	
	public void Appearance() { //clicking on appearance.
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[4]/a")).click();
	}

	public void Maildropbox() { //clicking on mail drop box
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[5]/a")).click();
	}
	
	public void Users() { //clicking on users
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[6]/a")).click();
	}
	
	public void Opportunities() { //clicking on opportunities
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[7]/a")).click();
	}
	
	public void Tracks() { //clicking on tracks
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[8]/a")).click();
	}
	
	public void Taskcategories() { //clicking on task categories
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[9]/a")).click();
	}
	
	public void Customfields() { //clicking on custom fields
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[10]/a")).click();
	}
	
	public void Tags() { //clicking on tags
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[11]/a")).click();
	}
	
	public void Integrations() { //clicking on integrations
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[12]/a")).click();
	}
	
	public void Trash() { //clicking on trash
		driver.findElement(By.xpath("//div[@class='left-fixed']/ul/li[13]/a")).click();
	}
}
