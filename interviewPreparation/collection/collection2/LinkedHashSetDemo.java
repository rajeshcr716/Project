package collection2;
 

import java.util.*;

public class  LinkedHashSetDemo {
	public static void main(String ar[])
	{

		    LinkedHashSet t = new LinkedHashSet();
		   
		  t.add("a");
		  t.add("z");
		  t.add("i");
		  t.add(null);
		  t.add(null);
		  //null not allowed
		  t.add(10); 
		  // hetrogenius not  allowed 
		  System.out.println(t.add("a"));  //false
		   
		  System.out.println(t);
		  
		  
		 
	}

	 
}
