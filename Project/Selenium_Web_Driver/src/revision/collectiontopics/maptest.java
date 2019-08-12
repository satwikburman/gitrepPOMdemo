package revision.collectiontopics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class maptest {

	public static void main(String args[]) {
		
		Map<Integer,String> mapone=new HashMap<Integer, String>();
		mapone.put(1, "Aron");
		mapone.put(2, "Bissaka");
		mapone.put(3, "Daniel");
		mapone.put(4, "James");
		Collection<String> L3= mapone.values(); //pointing to reference collection interface.
		System.out.println(L3);
		
		Map<Integer,String> maptwo=new HashMap<Integer, String>();
		
		maptwo.put(4, "Eden");
		maptwo.put(2, "Gudjohnson");
		maptwo.put(8, "Frank");
		maptwo.put(5, "Austin");
		System.out.println("****************");
	
		List<Integer> L1=new ArrayList<Integer>(mapone.keySet()); //converting set to list
		List<Integer> L2=new ArrayList<Integer>(maptwo.keySet()); //converting set to list
		System.out.println(L1);
		System.out.println(L2);
		for(int keyone:L1) {
			System.out.println(mapone.get(keyone));
		}
		System.out.println("******************");
		for( int keytwo:L2) {
			System.out.println(maptwo.get(keytwo));
			
		}
		
		Set<Integer> testset=new LinkedHashSet<Integer>(mapone.keySet()); //Set object to set of integer type by default it is object type
		System.out.println(testset);
		
		
		for(int keyone:L1) {
			for( int keytwo:L2) {
				if(keyone==keytwo) {
					System.out.println("Match of map one " +mapone.get(keyone));
					System.out.println("Match of map two" +maptwo.get(keytwo));
				}
			}
			
			
			for(Map.Entry<Integer,String> es:mapone.entrySet()) {
				
				System.out.println(es.getValue());
				System.out.println(es.getKey());
				
			}
			
		
			boolean checkfordups=L1.retainAll(L2);
			System.out.println(L1);
			
		}
		
		/*
		 * for(int k:mapone.keySet()) { for (int j:maptwo.keySet()) {
		 * 
		 * } }
		 */
		//https://stackoverflow.com/questions/14026848/comparing-key-and-values-of-two-java-maps
	}
	
}
