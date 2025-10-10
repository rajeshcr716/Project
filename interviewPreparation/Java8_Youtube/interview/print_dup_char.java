package interview;

 import java.util.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class print_dup_char {
	public static void main(String[] args) {
	
		  // given input string
        String input = "JavaJavaEE";
         
 
     //   input.chars().forEach(System.out::println);
        
    
        
        
        // convert string into stream
        Map < Character, Long > result = 
        	 input
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println( result);
     
        
     
        
        
		/*
		   result.forEach((k, v) -> { if (v > 1) { System.out.println(k + " : " + v); }
		   });
		 */
		
		
		
		
		
	}
}
