package revision.collectiontopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Lists {
	
	int a;
	int b;
	String c;
	Lists(int a,int b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public static void main(String[] args) {
		//ArrayList stores in dynamic array and allows duplicates and null, manipulation takes time due to shifting of elements inside the framework,indexing starts from 0, has no
		//addFirst and addLast methods that is specific to Linked List data structures.
		List<Object> L1=new ArrayList<Object>(); //upcasting
		L1.add(null);
		L1.add("Demo String");
		L1.add('G');
		L1.add(19);
		L1.add(null);
		L1.remove(0);
		L1.set(0,5);
		L1.add(0,65);
		System.out.println(L1.size());
		System.out.println(L1);
		Iterator itr1=L1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Stack<String> st=new Stack<String>(); //A stack declaration
		
		LinkedList<String> L2=new LinkedList<String>();
		L2.add("Paris");
		L2.add("Rome");
		L2.addFirst("Nigeria");
		L2.addLast("Poland");
		L2.addLast("Poland");
		//L2.remove(4);
		L2.add(4, "Venice");
		L2.add(0, "Pripiyat");
		L2.add(2, "Sweden");// during addition shifts occur but during removal it gets done by GC
		//System.out.println(L2.get(4)); //Here if a element is removed that index remains empty unless nothing is again added to that particular index.
		System.out.println(L2);
		//Linked Lists has addFirst and addLast methods to it, because it is a doubly linked list, it has a head and tail and any get() operation starts from head so it takes time.
		//peek returns the first element of a stack. push to put elements inside a stack pop to eject the last inserted element as it is a LIFO data structure.
		//Queue has peek() and element() for giving the head element, and poll() and remove() for removing the head. It does not allow null values, but allows duplicates. cannot use get()
		//poll() and remove() removes the latest entries which got pushed into the framework. It displays and removes the head.
		PriorityQueue<String> Q1=new PriorityQueue<String>();  
		Q1.add("Steve");
		Q1.add("Robert");
		Q1.add("Mathis");
		Q1.add("Mathis");
		//Q1.add("Harris");
		Q1.add("Kevin");
		Q1.add("Scars");
		
		
		
		//Q1.add(null);
		System.out.println("********");
		System.out.println(Q1.peek());
		System.out.println(Q1.element());
		System.out.println(Q1);
		System.out.println(Q1.remove());
		System.out.println(Q1.poll());
		System.out.println(Q1);
		
		//Set does not allow duplicates and is unordered as in insertion order by default is not maintained. and allows null, it gives random elements when returned and fetching is faster
		//Hashing is used internally hence no duplicates are allowed.
		
		Lists e1=new Lists(3, 7, "Iker");
		Lists e2=new Lists(8, 4, "Casillas");
		Set<Object> S1=new HashSet<Object>();
		S1.add(e1);
		S1.add(e2);
		/*
		 * S1.add(args); S1.add(null); System.out.println(S1);
		 */
		Iterator itr2=S1.iterator();
		while(itr2.hasNext()) {
			Lists e=(Lists) itr2.next();
			System.out.println(e.a);
			System.out.println(e.b);
			System.out.println(e.c);
			
		}
		
		TreeSet<Integer> TS=new TreeSet<Integer>();
		TS.add(5);
		TS.add(9);
		TS.add(3);
		TS.add(59);
		TS.add(27);
		TS.remove(5);
		System.out.println(TS);
		
		List<Integer> LI=new ArrayList<Integer>(TS);
		Collections.sort(LI, Collections.reverseOrder());
		System.out.println(LI);
		
		/*
		 * Set<Object> SO= new LinkedHashSet<Object>(); SO.add(null);
		 * System.out.println(SO);
		 */
		
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>(); // In has table we use put and not add to add
		// elements
           hm.put(1, "Vidal");
           hm.put(2, "Scott");
           hm.put(3, "VVD");
           hm.put(4, "Rashy");
           hm.put(5, "Umtiti");
           hm.put(7, "Rice");
           hm.put(8, "Rice");
           //hm.put(null,"Bush");
           System.out.println(hm.size());
           System.out.println(hm.get(6)); //If a key is not there or if nothing is there across a key then it would return run.
           for (Integer s : hm.keySet()) {
           System.out.println(hm.get(s));
            }
		
		String str[]= {"Appium", "QTP", "Selenium", "Grid", "IDE", "Core"};
		List<String> CL=Arrays.asList(str); //converting string to list
		System.out.println(CL); //Converting a string array to a list.
		
		
		
		
		

	}

}
