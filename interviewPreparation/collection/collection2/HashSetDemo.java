package collection2;

import java.util.*;

 
 

public class HashSetDemo {
	public static void main(String ar[])
	{

		HashSet h = new HashSet();
		h.add("a");
		h.add("a");
		h.add(10);
		h.add(null);
		h.add(null);
		h.add("z");
		h.add("c");
		h.add("p");
		h.add("k");
	     h.add(null);  // only one time print ..2nd time not printing
		System.out.println(h.add("a"));
		 
		//System.out.println(h.add(null)); 
		System.out.println(h);
	}

}
