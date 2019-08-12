package restapiautomation.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base {
	
	public int SC_Success=200;
	public int SC_Created=201;
	public int SC_Accepted=202;
	public int SC_BadReq=400;
	public int SC_Forbidden=403;
	public int SC_Servererror=500;
	

	public Properties prop;
	public FileInputStream FIS;
	public String getdata(String val){
		try {
			FIS=new FileInputStream(".\\src\\restapiautomation\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(FIS);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String toret=prop.getProperty(val);
		return toret;
		
	}
}
