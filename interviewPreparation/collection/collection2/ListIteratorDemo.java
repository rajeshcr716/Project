package collection2;

import java.util.*;

public class ListIteratorDemo {
	public static void main(String ar[])
	{
 // it read and remove adn replace the object from the collection 
//ex: we only count and remove the apple in apple box.replaceable the Rotton apple.
		  LinkedList l = new LinkedList();
		 
		l.add("balakrishna");
		 l.add("chiru");
		 l.add("venky");
		 l.add("nag");
		 
		 System.out.println(l);//[0,1,2,3.....10]   

	 ListIterator itr = l.listIterator();
	 while(itr.hasNext()){
		 String s = (String)itr.next();
		 
		 if(s.equals("venky"))
		 {
			 itr.remove();
		 }
			 else if(s.equals("nag"))
			 {
				 itr.add("chaitu");
			 }
			 else if (s.equals("chiru")){
				 itr.set("charan");
		 }
		 
	 System.out.println(l);
		 
	 }
	
	
	
	}
	
	
}
