package restapiautomation.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import okhttp3.internal.http2.Header;

public class baseclient {
	
	//GET Method
	public int get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet hget=new HttpGet(url); //creating a connection in between the code and the url
        CloseableHttpResponse response=httpclient.execute(hget);// here we are executing the connection created via httpclient
        //Recording the status code
       int StatusCode= response.getStatusLine().getStatusCode();
       System.out.println(StatusCode);
       //Recording the response in string
       String responseString=EntityUtils.toString(response.getEntity(),"UTF-8"); //In any case we need UTF-8 standard string format.
       //Recording response via JSON Object
       JSONObject responsejson=new JSONObject(responseString);
       System.out.println("Response JSON from API" +responsejson);
       //Recording header output from API
       org.apache.http.Header[] headers=response.getAllHeaders(); //Getting all the additional headers too
       HashMap<String,String> allheaders=new HashMap<String,String>();
       for (org.apache.http.Header header:headers) {
    	   allheaders.put(header.getName(), header.getValue());
    	   
       }
       System.out.println(allheaders);
       return StatusCode;
	}
	

}
