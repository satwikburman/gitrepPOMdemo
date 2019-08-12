package sel.webdrriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilib {
	  static FileInputStream fis;
	
	public static void Snapshot(WebDriver d, String snapname) {
		TakesScreenshot ts=(TakesScreenshot) d;
		File source=(ts.getScreenshotAs(OutputType.FILE)); // Snapshot taken here
		try {
			org.openqa.selenium.io.FileHandler.copy(source, new File("C:\\Selenium Training Workspace\\Selenium_Web_Driver\\Snapshots\\"+snapname+".png"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Snap shot taken");
	}
	
	public static String getprop(String key) {
		
			
			
				try {
					fis = new FileInputStream("C:\\Selenium Training Workspace\\Selenium_Web_Driver\\src\\testng\\Test.properties");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		    Properties p=new Properties();
		    
				try {
					p.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			String fetch=p.getProperty(key);
			return fetch;
	}

}
