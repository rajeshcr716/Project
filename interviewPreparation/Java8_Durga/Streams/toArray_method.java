package Streams;

import java.util.ArrayList;

public class toArray_method {
	
// Converting an arrayList to array. 	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(35);
		
		System.out.println(" list:  "+l);
		
		Integer[] array = l.stream().toArray(Integer[] :: new);
		//copy the element in the stream to specified array
		
		
		for (Integer w: l)
		{
			System.out.println(w);
		}
		
	}	
}
// Integer[] array = l.stream().toArray(Integer[] :: new);

//This line converts the ArrayList<Integer> to an Integer[], 
//using Integer[]::new to allocate the appropriate array size.
//
//Summary
//Integer[] :: new is a concise way to specify that you want to 
//create a new Integer array when converting the stream of the list to an array. 
//It ensures that the result is specifically of type Integer[].