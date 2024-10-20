package Predicate_Int;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.*;

 

 public  class Check_Empty {
	 public static void  main(String ar[])
	 {
		 
		 Predicate<Collection> p = c -> c.isEmpty();   //Collction only not Collections
		 Predicate<Collection> p1 = c -> c.contains("A");
		 
		ArrayList l1 = new ArrayList();    // If not metion type then both homogenious and hetrogenious elements supported
		 
		 l1.add("A");
		 l1.add("B");
		 l1.add(10);
		// System.out.println(p.test(l1));
		
		 //--extra practice
		 System.out.println(p1.or(p).test(l1));
		 System.out.println(p.negate().test(l1));
		 
		 
		 ArrayList<Integer> l2 = new ArrayList<Integer>();
		 
		 
		  
		 System.out.println(p.test(l2));
		 
		 
	 }

}
