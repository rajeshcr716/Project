package interview;

 import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class print_duplicate_integer {
	public static void main(String[] args) {
		
	//method-->1
   //add element to set if it is duplicate not added to set it come out printing..
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 
		 
		   Set<Integer> set = new HashSet(); 
		   myList.stream() .filter(n -> !set.add(n)).forEach(System.out::println);
	 
		 
   //method-->2
  //freq more than 1 store in set and print the set 
		   
	Set<Integer> dup	= myList.stream()
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
