package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Duplicate_String {
public static void main(String[] args) {
		
		
	 
	
	

	List<String>  l  =  new ArrayList<String>();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter 3 strings:"+'\n');
	for(int i=1; i<=7; i++)
	{
		 
		String l1 = sc.next();
		  l.add(l1);
		
	}

	 System.out.println(l);
	
		
		
   Map<Object, Long> res =     l.stream()
			             .filter(i->Collections.frequency(l, i)>1)
			            .collect(Collectors.groupingBy((c->c),Collectors.counting()));
			                      
			                        
			                      
			         System.out.println(res);
		                      
		    
		     
		
	}
}
