package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class print_duplicate_string {
	public static void main(String[] args) {
		
	
		
 /// prefer this method 		
		
		   String s = "java";
		   
		   
		   
		   String s1[] = s.split("");
		   
		   List<String> l = Arrays.asList(s1);
		   
		 Set t = new LinkedHashSet<>();
		   
		 List<String> res = 
		    l.stream()
		    .filter(a->t.add(a))
		    .collect(Collectors.toList());
		     System.out.println(res);
		
		
		
		
		
		
		
		
		
		//method-->1	
			 
			List<String> myList = Arrays.asList("Rajesh","mahesh","Rajesh");
		 
			 
			   Set<String> set = new HashSet(); 
			
	      myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		 
			 
	//method-->2
			   
		Set<String> dup	= myList.stream()
			.filter(i->Collections.frequency(myList, i)>1)
			.collect(Collectors.toSet());
		
		System.out.println(dup);
		
		
		
		
		//another mehtod..simple
		System.out.println("using single line: "+'\n');
		
		myList.stream()
				.filter(i->Collections.frequency(myList, i)>1)
				.distinct()
				.forEach(System.out::println);
		
		
	 
		}

}
