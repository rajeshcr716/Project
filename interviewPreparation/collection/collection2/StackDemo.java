package collection2;

import java.util.*;

public class StackDemo {
	public static void main(String ar[])
	{

		   Stack t = new Stack();
		   
		  t.add("a");
		  t.add("z");
		  t.add("i");
		 // t.add(10); // not allowed
		  System.out.println(t.add("i")); //false not allowed
		  System.out.println(t);
	}
}
