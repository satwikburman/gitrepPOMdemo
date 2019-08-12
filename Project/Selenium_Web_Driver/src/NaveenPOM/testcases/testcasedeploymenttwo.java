package NaveenPOM.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import NaveenPOM.baseactions.browserbase;
import NaveenPOM.pages.Accountpage;
import NaveenPOM.pages.Appearancepage;
import NaveenPOM.pages.Customfieldpage;
import NaveenPOM.pages.Exportpage;
import NaveenPOM.pages.Integrationspage;
import NaveenPOM.pages.Invoicepage;
import NaveenPOM.pages.Loginpage;
import NaveenPOM.pages.Maildropbox;
import NaveenPOM.pages.Opportunitiespage;
import NaveenPOM.pages.Tagspage;
import NaveenPOM.pages.Taskcategorypage;
import NaveenPOM.pages.Trackspage;
import NaveenPOM.pages.Trashpage;
import NaveenPOM.pages.Userpage;


//This test case corresponds to the second set of requirements where workflow starts from logging in and then going to account settings and testing all the functionalities of the accounts tab.
public class testcasedeploymenttwo extends browserbase{
	
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
		LP.clickonaccount();
		Thread.sleep(5000);
		/*
		 * List<WebElement> Ifr=driver.findElements(By.tagName("iframe"));
		 * System.out.println(Ifr.size());
		 */
		/*
		 * driver.findElement(By.xpath("//footer[@class='modal-dialog-footer']/button"))
		 * .click(); LP.clickonaccount();
		 */
		
		
	}
	
	@Test(priority=2)// Verifying functionalities and page header of accounts tab
	public void accounttestcase() throws InterruptedException {
		Accountpage AP=PageFactory.initElements(driver, Accountpage.class);
		String actualacctitle=AP.getaccounttitle();
		String expectedacctitle="Account Settings";
		boolean checkacctitle=actualacctitle.equalsIgnoreCase(expectedacctitle);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(checkacctitle);
		sa.assertAll();
		AP.getleftaccmenu().Invoices();
        Thread.sleep(3000);
		
	}
	
	@Test(priority=3)//  Verifying functionalities and page header of invoice tab
	public void invoicetestcase() {
		Invoicepage IP=PageFactory.initElements(driver, Invoicepage.class);
		String expectedinvoicetitle=IP.getinvoicetitle();
		String actualinvoicetitle="Invoices";
		boolean checkinvoicetitle=expectedinvoicetitle.equalsIgnoreCase(actualinvoicetitle);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(checkinvoicetitle);
		sa.assertAll();
		IP.clickonhome();
		IP.clickonaccount();
		IP.getleftaccmenu().Export();
	}
	
	@Test(priority=4) //Verifying functionalities and page header of export tab
	public void exporttestcase() {
		Exportpage EP=PageFactory.initElements(driver, Exportpage.class);
		String expectedexportheader=EP.getexporttitle();
		String actualexportheader="Export";
		boolean checkexporttitle=expectedexportheader.equalsIgnoreCase(actualexportheader);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(checkexporttitle);
		sa.assertAll();
		EP.getleftaccmenu().Appearance();
		
	}
	
	@Test(priority=5) // Verifying functionalities and page header of appearance tab
	public void appearancetestcase() {
		Appearancepage AP=PageFactory.initElements(driver, Appearancepage.class);
		String expectedapptitle=AP.getappearancetitle();
		String actualapptitle="Appearance";
		boolean checkapptitle=expectedapptitle.equalsIgnoreCase(actualapptitle);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(checkapptitle);
		sa.assertAll();
		AP.uploadlogo();
		WebElement img=driver.findElement(By.xpath("//label[contains(text(),'Current logo image')]"));
		String imageverification=img.getText();
		System.out.println(imageverification);
		AP.getleftaccmenu().Maildropbox();
	}
	
	@Test(priority=6) // Verifying functionalities and page header of mail drop box tab
	public void maildropboxtest() {
		Maildropbox MP=PageFactory.initElements(driver, Maildropbox.class);
		String expectedmdbtitle=MP.returnmdbtitle();
		String actualmdbtitle="Mail Drop Box";
		boolean checkmdbtitle=expectedmdbtitle.equalsIgnoreCase(actualmdbtitle);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(checkmdbtitle);
		sa.assertAll();
		MP.getleftaccmenu().Users();
	}
	
	@Test(priority=7) //  Verifying functionalities and page header of ussers tab
	public void userstest() {
		Userpage UP=PageFactory.initElements(driver, Userpage.class);
		String expectedusertitle=UP.getusertitle();
		String actualusertitle="Users";
		boolean checkusertitle=expectedusertitle.equalsIgnoreCase(actualusertitle);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(checkusertitle);
		UP.clickonaddnewuser();
		UP.addnewuser(getProp("nufname"), getProp("nulname"), getProp("nuemail"), getProp("nuusername"));
		String validatingaddeduser=getProp("nufname")+" "+getProp("nulname");
		sa.assertTrue(driver.findElement(By.linkText(validatingaddeduser)).isDisplayed());
		sa.assertAll();
		UP.getleftaccmenu().Opportunities(); 
		//UP.getleftaccmenu().Tracks();
	}
	
	@Test(priority=8) // Verifying functionalities and page header of accounts tab
	public void opportunitiestest() throws InterruptedException {
		Opportunitiespage OP=PageFactory.initElements(driver, Opportunitiespage.class);
		String expectedopptitle=OP.getopptitle();
		String actualopptitle="Opportunities";
		boolean oppcheck=expectedopptitle.equalsIgnoreCase(actualopptitle);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(oppcheck);
		OP.clickonmilestone();
		OP.addmilestone(getProp("msname"), getProp("msdesc"), getProp("pow"), getProp("dus"));
		/*
		 * String validatingms=getProp("msname"); System.out.println(validatingms);
		 * sa.assertTrue(driver.findElement(By.linkText(validatingms)).isDisplayed());
		 */
		sa.assertAll();
		OP.clickonhome();
		OP.clickonaccount();
		OP.getleftaccmenu().Tracks(); //To be implemented once entire flow is completed.
	}
	
	@Test(priority=9) // Verifying functionalities and page header of tracks tab
	public void trackstestcase() {
		Trackspage TP=PageFactory.initElements(driver, Trackspage.class);
		String expectedtrackstitle=TP.gettracktitle();
		String actualtrackstitle="Tracks";
		boolean checktrackstitle=expectedtrackstitle.equalsIgnoreCase(actualtrackstitle);
		TP.clickonaddtracks();
		TP.addnewtracks(getProp("trackname"), getProp("tracktag"), getProp("tracktask"));
		SoftAssert sa=new SoftAssert();
		String validatingtracks=getProp("trackname");
		sa.assertTrue(driver.findElement(By.linkText(validatingtracks)).isDisplayed());
		sa.assertTrue(checktrackstitle);
		sa.assertAll();
		TP.getleftaccmenu().Taskcategories();
	}
	
	@Test(priority=10)// Verifying functionalities and page header of taskcategory tab
	public void taskcategorytestcase() throws InterruptedException {
		Taskcategorypage TCP=PageFactory.initElements(driver, Taskcategorypage.class);
		String expectedtctitle=TCP.gettaskcattitle();
		String actualtctitle="Task Categories" ;
		boolean validatingtaskcat=expectedtctitle.equalsIgnoreCase(actualtctitle);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(validatingtaskcat);
		TCP.clickonaddnewcat();
		Thread.sleep(3000);
		TCP.addtaskcategory(getProp("taskcatname"));
		Thread.sleep(3000);
		String validatingtcadd=getProp("taskcatname");
		sa.assertTrue(driver.findElement(By.linkText(validatingtcadd)).isDisplayed());
		sa.assertAll();
		TCP.getleftaccmenu().Customfields();
		
		
	}
	
	@Test(priority=11) //Verifying functionalities and page header of custom field tab
	public void customfieldstestcase() {
		Customfieldpage CFP=PageFactory.initElements(driver, Customfieldpage.class);
		String expectedcfptitle=CFP.getcustomfieldtitle();
		System.out.println("Expected cf title: "+expectedcfptitle);
		String actualcfptitle="Custom Fields";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(expectedcfptitle.equalsIgnoreCase(actualcfptitle));
		sa.assertAll();
		CFP.getleftaccmenu().Tags();
		
	}
	
	@Test(priority=12)// Verifying functionalities and page header of tags tab
	public void tagstestcase() throws InterruptedException {
		
		Tagspage TP=PageFactory.initElements(driver, Tagspage.class);
		String expectedtagstitle=TP.gettagstitle();
		String actualtagstitle="Tags and DataTags";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(expectedtagstitle.equalsIgnoreCase(actualtagstitle));
		TP.clickonaddnewtag();
		Thread.sleep(4000);
		WebDriverWait WD=new WebDriverWait(driver, 10);
		WebElement e=WD.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id177:j_id210"))); //Using explicit wait statement
		System.out.println(e.isDisplayed());// checking element got displayed or not
		TP.addnewtag(getProp("newtag"));
		Thread.sleep(4000);
		String validateaddedtag=getProp("newtag");
		sa.assertTrue(driver.findElement(By.linkText(validateaddedtag)).isDisplayed());
		sa.assertAll();
		TP.getleftaccmenu().Integrations();
		
		
	}
	
	@Test(priority=13)//  Verifying functionalities and page header of integration tab
	public void integrationstestcase() {
		Integrationspage IP=PageFactory.initElements(driver, Integrationspage.class);
		String expectedinttitle=IP.getintegrationtitle();
		String actualinttitle="Integrations";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(expectedinttitle.equalsIgnoreCase(actualinttitle));
		IP.buttoncount();
		int count=IP.buttonlist.size();
		System.out.println("Count of configure button present in the page is:" +count);
		IP.getleftaccmenu().Trash();
	}
	
	@Test(priority=14)//  Verifying functionalities and page header of trash tab
	public void trashtestcase() {
		Trashpage TP=PageFactory.initElements(driver, Trashpage.class);
		String expectedtrashtitle=TP.gettrashtitle();
		String actualtrashtitle="Trash";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(expectedtrashtitle.equalsIgnoreCase(actualtrashtitle));
		sa.assertAll();
	}
	
	
	@AfterClass // closing browser post test-case completion
	public void closebrowser() {
		crash();
	}
	
	@AfterMethod ////After method is running after every test-case to track it's status whether it has passed or failed, in case of failure and getStatus() code 2 snapshot is taken.
	public void snapshotuponerror(ITestResult ITRES) {
		if(ITestResult.FAILURE==ITRES.getStatus()) {
			takeSnapshot(driver, ITRES.getName());
		}
	}

}
