package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class distinct_numbers {
	public static void main(String[] args) {
		
	 	List<Integer> num = Arrays.asList(10,20,10,45,67,45,19,20);
	// write pgm for remove duplicate numbers use this  	
	// add like for above line-->	num.stream()
	
		
		List<Integer> dist = 
				 num.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(dist);
	 	
		
		
		
		
	//-->shortcut we directly printing the group of values.	
		
		System.out.println('\n'+"for group of values"+'\n');
	   Stream.of(10,20,10,45,67,45,19,20) .distinct() .forEach(System.out::println);
	  
	  
		 
	
		
	}

}
