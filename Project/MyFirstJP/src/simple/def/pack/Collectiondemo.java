package simple.def.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Emp{
	String name;
	int salary;
	String dept;
	
	Emp(String name,int salary,String dept){
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
}
public class Collectiondemo {

	public static void main(String[] args) {
	
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Hello");
		al.add(98);
		al.add('e');
		al.add(true);
		al.add(89.7);
		al.add(null);
		System.out.println(al);
		System.out.println("------------------");
        Iterator itr= al.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println(al.size());
        System.out.println(al.get(3));
        System.out.println("**********************");
        
        Emp e1=new Emp("Mark",6000,"Base-Guitar");
        Emp e2=new Emp("Steven",8000,"Vocals");
        
        ArrayList<Emp> al1=new ArrayList<Emp>();
        al1.add(e1);
        al1.add(e2);
        Iterator itr1=al1.iterator();
        while(itr1.hasNext()) {
        	Emp e=(Emp) itr1.next();
        	System.out.println(e.name);
        	System.out.println(e.salary);
        	System.out.println(e.dept);
        }
        System.out.println("*********************");
        
        ArrayList<Object> al2=new ArrayList<Object>();
        al2.add("UCL");
        al2.add("EPL");
        al2.add("Hello");
        al2.add(98);
        al2.add(108.9);
        al2.add(false);
        
        //al2.addAll(al);
        //al2.removeAll(al);
        al2.retainAll(al);// Retains the common ones without duplicates.
       
       
        for(int i=0;i<al2.size();i++) {
        	System.out.println(al2.get(i));
        }
        
       
        	
        System.out.println("********LinkedList Demo**********");
        
        LinkedList<Emp> ll=new LinkedList<Emp>();
        ll.add(e1);
        Iterator it= ll.iterator();
        while(it.hasNext()) {
        	Emp em=(Emp) it.next();
        	System.out.println(em.dept);
        	System.out.println(em.name);
        	System.out.println(em.salary);
        }
        LinkedList<Integer> llist=new LinkedList<Integer>();
        llist.add(3);
        llist.add(2);
        llist.add(6);
        llist.add(7);
        llist.add(null);
        llist.addFirst(8);
        llist.addLast(9);
        llist.set(0, 72);
        llist.remove(2);
        llist.add(5, 69);// Only sequential access allowed
        System.out.println(llist); //LinkedList treats duplicates while ArrayList ignores duplicates
        System.out.println(llist.get(2));
        }

}
