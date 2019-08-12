package revision.collectiontopics.POMrevdemo.basefunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class revpropsanpshot {
	
	FileInputStream FIS;
	
	public void snapshot(WebDriver driver,String name) {
		TakesScreenshot TS=(TakesScreenshot) driver; //downcasting to access methods
		File src=TS.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Selenium Training Workspace\\Selenium_Web_Driver\\Snapshots"+name+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String revreadingprop(String param) {
		
		try {
			 FIS=new FileInputStream("C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\testng\\Test.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(FIS);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret=prop.getProperty(param);
		return ret;
	}

}
