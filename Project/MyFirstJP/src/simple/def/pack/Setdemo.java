package simple.def.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class Setdemo {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();// Set demo implementing properties like random access and no
											// duplicates
		hs.add(89);
		hs.add("Hellujah");
		hs.add(65.4);
		hs.add(true);
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		String str[] = { "Hello", "Gavin", "You", "Are", "Sheer", "Perfection"};
		//int u=str.length;
		List<String> ls = Arrays.asList(str);
		System.out.println(ls);// Converting a string array to a list

		Collections.sort(ls);
		System.out.println(ls);
		Collections.sort(ls, Collections.reverseOrder());
		System.out.println(ls);

		List<Integer> int_list = new ArrayList<Integer>();
		int_list.add(34);
		int_list.add(42);
		int_list.add(78);
		int_list.add(21);
		int_list.add(8);
		int_list.add(108);
		//int_list.add(null);
		
		System.out.println(int_list);

		Collections.sort(int_list);
		System.out.println(int_list);
		Collections.sort(int_list, Collections.reverseOrder());
		System.out.println(int_list);

		/*
		 * Integer inttab[]= {78,65,97,34,21,53}; List<Integer> il=Ints.asList(intab);
		 * System.out.println(ls);
		 */

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>(); // In has table we use put and not add to add
																			// elements
		hm.put(1, "Vidal");
		hm.put(2, "Scott");
		hm.put(3, "VVD");
		hm.put(4, "Rashy");
		hm.put(5, "Umtiti");
		hm.put(7, "Rice");
		//hm.put(null,"Bush");
		System.out.println(hm.size());
		System.out.println(hm.get(6));
		for (Integer s : hm.keySet()) {
			System.out.println(hm.get(s));
		}
	}

}
