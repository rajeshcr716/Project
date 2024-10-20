package Streams;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNO_withStream {
	public static void main(String[] args) {
		
	
	
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(5);
	l.add(35);
	
	System.out.println("Even no in list:  "+l);
	
List<Integer> l1 = l.stream().filter(s->s%2==0).collect(Collectors.toList());

 System.out.println("Using Stream to print even no: "+l1);
	
}
}