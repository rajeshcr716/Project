package collection2;

import java.util.*;

public class VectorDemo {

	public static void main(String ar[])
	{

 //underlying data structure Resizeable array (or) Growable arry
 // Duplication allowed,insertion order prserved,hetrogenius allowed.
//null insertion is possible,All method present in Vector  are synchronised and thread safe.
//best choice if frequent operation is retrival.
		
		  Vector t = new Vector();
		   
		  t.add("a");
		  t.add("z");
		  t.add("i");
		 // t.add(10); // not allowed
		  System.out.println(t.add("i")); //false not allowed
		  System.out.println(t);
	
	}
	
	
	
	
	
}
