package revision.collectiontopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Arraytolistandvv {
	public static int io;

	public static void main(String[] args) {
		
		String remdup[]= {"red","green","purple","blue","grey","black","ReD"}; //declared a string
		List<String> strlist=new ArrayList<>();
		strlist=Arrays.asList(remdup);
		System.out.println(strlist);
		List<String> convlist=new LinkedList<String>();
		for(String s:strlist) {
			convlist.add(s.toLowerCase());
		}

		System.out.println(convlist);
		Set<String> S1=new LinkedHashSet<>(convlist);
		System.out.println(S1);
		int len=S1.size();
		String strtwo[]=S1.toArray(new String[len]);
		for(int i=0;i<strtwo.length;i++) {
			System.out.print(strtwo[i]+", ");
		}
		
		
	}

}
