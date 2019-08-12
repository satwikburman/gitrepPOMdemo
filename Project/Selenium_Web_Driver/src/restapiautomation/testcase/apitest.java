package restapiautomation.testcase;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import restapiautomation.base.base;
import restapiautomation.client.baseclient;

public class apitest extends base {
	
	String url,apiurl,hosturl;
	baseclient bs;

	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		 hosturl=getdata("URL");
		 apiurl=getdata("serviceurl");
		 url=hosturl+apiurl;
		
	}

	@Test
	public void checkAPI() throws ClientProtocolException, IOException {
		bs=new baseclient();
		int Scode= bs.get(url);
		Assert.assertEquals(Scode, SC_Success);
	}
	
	

}
