package revision.collectiontopics;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;

public class mapimplementation {

	public static void main(String[] args) {
		System.out.println("User name is: "+getUsername("customer")+" And password for the user is: "+getUserpass("customer"));

		getFullData();
		
		Date date=new Date();
		System.out.println(date);
		String datetostring=date.toString();
		System.out.println(datetostring.replaceAll(" ", "_").replaceAll(":", "_"));
	}

	
	//Hashmap is not thread safe when it comes to synchronization and also Hashmap can have one null key and multiple null values but not for HashTable, it cannot have any null entities.
	public static  HashMap<String, String> getHash() {
		HashMap<String,String> usermap=new HashMap<>(); //Storing values like uname and password separated by a colon.
		usermap.put("customer", "dummyenduser:demo@123");
		usermap.put("admin", "dummyadminuser:admin@123");
		usermap.put("distributor", "dummydistuser:dist@123");
		usermap.put("sales", "dummysalesuser:sales@123");
		usermap.put("custcare", "dummycustcareuser:custcare@123");
		
		return usermap;
	}
	
	public static String getUsername(String key) {
		String []userdata=getHash().get(key).split(":");
	    String username=userdata[0]; //Splitting the string and taking the first one.
	    return username;
	}
	
	public static String getUserpass(String key) {
		String []userdata=getHash().get(key).split(":");
	    String userpass=userdata[1]; //Taking the second string of the memory allocation second slot.
	    return userpass;
	}
	//We can use a special data structure called entry set,this entry set can be used to get all the data as keys and valus in list format
	//keySet() Gives the list of keys while values are being given by values()
	
	public static void getFullData() {
		for(Map.Entry<String, String> es:getHash().entrySet()) { //We can use Map.Entry or just Entry with the respective key set value, this returns an object which can be iterated over.
			System.out.println(es.getKey());
			System.out.println(es.getValue());
		}
	}
	
}
