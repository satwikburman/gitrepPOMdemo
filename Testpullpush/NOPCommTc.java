package testng.pomnopcom.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testng.pomnopcom.*;
import testng.pomnopcom.pages.LoginPage;
import testng.pomnopcom.pages.RegPage;
import sel.webdrriver.Utilib;
import testng.pomnopcom.baseactionmodule.*;



public class NOPCommTc extends BaseActions {
	
	
	
	@BeforeClass
	public void startBrowser() {
	
	init(Utilib.getprop("url"));
		
		
	}
	
	@AfterClass
	public void crashBrowser() {
	end();
	
	}
	
	@Test(priority=1, groups= {"Registration"})
	public void RegTC() throws InterruptedException {
		RegPage rp=PageFactory.initElements(driver, RegPage.class);
		rp.clickReg();
		Thread.sleep(2000);
		rp.fillPersonalDetails("Bruce", "Wayne", "10", "June", "1924", "bhoilovesrunningoverpeoplee@gmail.com");
	    Thread.sleep(2000);
	    rp.fillCompOp("IBM");
	    Thread.sleep(2000);
	    rp.fillPassword("Pass_12345678", "Pass_12345678");
	    Thread.sleep(4000);
	    rp.verifyTitle();
	    Thread.sleep(4000);
	    rp.clickonSubmit();
	    Thread.sleep(5000);
	    
		
	}
	
	@Test(priority=2, groups="Login")
	public void LoginTC() throws InterruptedException {
		LoginPage LP=PageFactory.initElements(driver, LoginPage.class);
		LP.doLogin();
		Thread.sleep(3000);
		LP.verifyTitle();
	    Thread.sleep(4000);
		LP.retCust("batman@gmail.com", "Pass_12345678");
		
	}
	
	//@Test(priority=3)
	public void demoFail() {
		driver.findElement(By.className("ico-wishlists")).click();
	}
	
	@AfterMethod
	public void ssOnFail(ITestResult its) {
		if(ITestResult.FAILURE==its.getStatus()) {
			//Returns 2 upon failure
			Utilib.Snapshot(driver, "ITestdemosnapshot");
		}
		System.out.println(its.getStatus());
		
	}
	

}
