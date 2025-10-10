package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class new_doubleList {
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(35);
		
		System.out.println("Even no in list:  "+l);
		
		
		List<Integer> l1 = l.stream().map(I -> I*2).collect(Collectors.toList());
		
		
		System.out.println("New List with doubled value: "+l1);
		
	}
	
	
}
