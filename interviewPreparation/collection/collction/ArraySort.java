package collction;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		
		
  ArrayList<String> a = new ArrayList<String>();
  
  a.add("UK");
  a.add("US");
  a.add("UAE");
  
  System.out.println("before sort");
  for(String country: a )   // just iterating 
  {
	  System.out.println(a);
	  break;
  }
		
  System.out.println("after sort");
  Collections.sort(a);
 
	 System.out.println(a);
	}
	
}
