package collection2;

import java.util.*;

public class TreeSetDemo {
	public static void main(String ar[])
	{

		   TreeSet t= new TreeSet();
		   
		  t.add("a");
		  t.add("z");
		  t.add("i");
		  t.add("i");
		 //t.add(10); // not allowed
		  System.out.println(t.add("i")); //false not allowed
		  System.out.println(t);
	}
}
