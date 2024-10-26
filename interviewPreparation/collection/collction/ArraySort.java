package collction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		
// Sort the Array of Strings and Integer using comparator and comparable interface.
// (or) you can directly use ArrayList 		
		
		String city[] = {"banglore", "kochi", "manglore"};
		 
		List<String> a1 = Arrays.asList(city);
		//Comparable Interface 
		Collections.sort(a1, (s1,s2) -> s2.compareTo(s1));
		System.out.println(a1);
		// Using Comparator Interface( method ) applicable for only Integer
//		Collections.sort(a1,(s1,s2) -> s1>s2?-1:s1<s2?+1:0);	
		
		
		
		Integer score[] = {1121,212,312,24};
		List<Integer> l1 = Arrays.asList(score);
		// using comparable Interface(method 1) applicable for both String and Interface
		Collections.sort(l1, (s1,s2) -> s1.compareTo(s2));
		
		// Using Comparator Interface( method ) applicable for only Integer
		Collections.sort(l1,(s1,s2) -> s1>s2?-1:s1<s2?+1:0);
		System.out.println(l1);		
		
// Iterate item present inside ArrayList		
		
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
