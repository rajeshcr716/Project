package interview;
import java.util.List;
import java.util.stream.*;

public class print_1_to_100 {
public static void main(String[] args) {
	
  	// print the numbers from 1 to 100.
	 
	 
	  IntStream.range(1, 101) .forEach(System.out::println);
	 
	
	 
	
}
}
