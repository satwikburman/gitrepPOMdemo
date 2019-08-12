package NaveenPOM.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import NaveenPOM.baseactions.browserbase;
import NaveenPOM.pages.Addcasepage;
import NaveenPOM.pages.Addpeoplepage;
import NaveenPOM.pages.Loginpage;

//This is the first test case as per desired requirement analysis, which would login into the system add a user validate whether the user has been added and then raise a case 
//corresponding to the same user and check whether the case is in a open state and whether the case window headline is correct or not and then close the browser. The test case is
//being responsive towards three java pages Loginpage, Addpeoplepage and Addcasepage.
public class testcasedeploymentpartone extends browserbase{
	
	@BeforeClass
	public void startbrowser() { //launching the browser byu calling the method launch from the browserbase class containing the WebDriver instance and launch and crash methods defined.
		launch(getProp("url"));
		
	}
	
	@Test(priority=1) //Login Test case and it's functionalities
	public void Login() throws InterruptedException 
	{
		Loginpage LP=PageFactory.initElements(driver, Loginpage.class);
		LP.doLogin(getProp("username"), getProp("password"));
		SoftAssert sa=new SoftAssert();
		String post_login_title=driver.getTitle();
		System.out.println(post_login_title);
		sa.assertTrue(post_login_title.contains("Dashboard"), "Login malfunctioned");
		sa.assertAll();
		
		
	}
	
	@Test(priority=2)// Adduser test-case and it's functionalities.
	public void adduser() throws InterruptedException {
		Addpeoplepage AP=PageFactory.initElements(driver, Addpeoplepage.class);
		AP.clickonaddpeople();
		AP.clickonaddperson();
		Thread.sleep(10000);
		AP.addperson(getProp("fname"), getProp("lname"), getProp("jobtitle"), getProp("org"), getProp("tags"), getProp("phone"), getProp("email"));
		AP.clickonhome();
		AP.clickonaddpeople();
		String validatinguser=getProp("fname")+" "+getProp("lname");
		System.out.println("The user which was added is : " +validatinguser);
		boolean check=driver.findElement(By.xpath("//a[contains(text(),'"+validatinguser+"')]")).isDisplayed();
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(check);
		sa.assertAll();
		AP.clickonhome();
		Thread.sleep(6000);
		
	}
	
	
	@Test(priority=3)//Add case test-case for creation of a case for the same user added by selecting from the drop down and validating whether case is in open state or not
	public void addCase() throws InterruptedException {
		Addcasepage AC=PageFactory.initElements(driver, Addcasepage.class);
		AC.clickoncase();
		AC.clickonaddcase();
		AC.createcase(getProp("caserelatedto"), getProp("casename"), getProp("casedescription"), getProp("casetag"));
		WebElement casetitle=driver.findElement(By.className("entity-details-title"));
		String expectedtestvalue=casetitle.getText();
		String actualtestvalue=getProp("casename");
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(expectedtestvalue.equalsIgnoreCase(actualtestvalue), "Not matching");
		WebElement cstatus=driver.findElement(By.className("kase-summary-status-open"));
		String casestatusexpected=cstatus.getText();
		System.out.println("Breakpoint value is: "+cstatus.getText());
		String casestatusactual="Open";
		boolean status=casestatusexpected.equalsIgnoreCase(casestatusactual);
		sa.assertTrue(status);
		String validatingcaseuser=getProp("fname")+" "+getProp("lname");
		boolean validating=driver.findElement(By.xpath("//a[contains(text(),'"+validatingcaseuser+"')]")).isDisplayed();
		sa.assertTrue(validating);
		sa.assertAll(); //To integrate all asserts and pass the actual integrated result
		
		
	}
	
	@AfterMethod //After method is running after every test-case to track it's status whether it has passed or failed, in case of failure and getStatus() code 2 snapshot is taken.
	public void snapshotuponerror(ITestResult ITRES) {
		if(ITestResult.FAILURE==ITRES.getStatus()) {
			takeSnapshot(driver, ITRES.getName());
		}
	}
	
	

	@AfterClass //Closing the browser and ending the test-case
	public void closebrowser() {
		crash();
	}
}
