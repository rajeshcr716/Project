package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sort_method {
	public static void main(String[] args) {
		
		
		ArrayList<Integer>l = new ArrayList<Integer>();
		
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		
		System.out.println(l);
		
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Default natural sorting order: "+l1+"\n");
		
		
		
		List<Integer> l2 = l.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		
		System.out.println("Customize Sorting order: "+l2);
		
		
		// Min and max method 
		
		Integer l3 = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
		
		System.out.println("Min value :+"+ l3);
		
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("Max value : "+ max);
		
		
		
		
	}

}
