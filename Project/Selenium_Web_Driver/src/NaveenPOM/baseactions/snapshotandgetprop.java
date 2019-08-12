package NaveenPOM.baseactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

//This is the base class which is lowest in the hierarchy, this class has methods like reading property file from an external file here it is NaveenTestData.properties. 
//The class has a method called get snap shot which is called after every test case and it executes only when ITestResult code is 2 which is a failure code, this class is extended by the
//base browser class which has WebDriver driver declared  globally and also browser open and close methods declared which is used in all test-cases underneath @BeforeTest annotation.
public class snapshotandgetprop {
	public FileInputStream fs;
	public void takeSnapshot(WebDriver d,String name) {
		TakesScreenshot ts=(TakesScreenshot) d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\src\\Naveensnapshots\\"+name+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getProp(String key) {
		try {
			fs=new FileInputStream(".\\src\\NaveenTestData.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties p=new Properties();
		try {
			p.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=p.getProperty(key);
		return value;
		
	}

}
