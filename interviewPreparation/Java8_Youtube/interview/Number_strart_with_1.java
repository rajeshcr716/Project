package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Number_strart_with_1 {
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(10,12,30,45,15);
		
		 
		 numbers.stream()
		 .map(s-> s + " ") // convert int to string
		 .filter(s->s.startsWith("1"))
		 .forEach(System.out::println);
		
	
	
	
	
	
	}
	
	


}
