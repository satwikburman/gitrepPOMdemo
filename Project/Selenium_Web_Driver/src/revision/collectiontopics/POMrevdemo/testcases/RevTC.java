package revision.collectiontopics.POMrevdemo.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import revision.collectiontopics.POMrevdemo.basefunctions.revbasebrowseractions;
import revision.collectiontopics.POMrevdemo.javaclasses.Homepage;
import revision.collectiontopics.POMrevdemo.javaclasses.Prodpage;


public class RevTC extends revbasebrowseractions {
	
	@BeforeTest
	public void start() {
		launch(revreadingprop("newurl"));
		
	}
	@Test
	public void EntDemo() {
		Homepage hp=PageFactory.initElements(driver, Homepage.class);
		hp.gettitle();
		hp.Enterdemo();
	}
	
	
	
	@Test
	public void demotest() {
		System.out.println("Checking");
	}
	
	@Test
	public void prod() {
		Prodpage pp=PageFactory.initElements(driver, Prodpage.class);
		pp.gettitle();
		pp.getit().catalog_toy();
	}
	
	@AfterTest
	public void end() {
		crash();
	}

}
