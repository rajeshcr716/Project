package collection2;

import java.util.*;
//import java.lang.*;;

public class ArrayListDemo {
public static void main(String ar[])
{
//underlying data structure Resizeable array (or) Growable arry
// Duplication allowed,insertion order prserved,hetrogenius allowed.
	
	 ArrayList t =new ArrayList();
	 
	   
	  t.add("a");
	  t.add(10);
	  t.add("A");
	  t.add(null);
	  System.out.println(t);
	
	  t.remove(2);
	  System.out.println(t);
	  //t.get(0);
	  System.out.println(t.get(3));
	 // t.add("z" ,"m");
	 // System.out.println(t);
	 
	  t.add("N");
	  System.out.println(t);
	   
	  
	  
	  
}
}
