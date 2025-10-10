package file_pgms;

import java.util.stream.Stream;

public class Reduce_pgm {

	public static void main(String[] args) {
		
		double total = Stream.of(7.3,1.5,4.8)
				.reduce(0.00, (a,b)-> a+b);   //0.00 (first part) is added as running total.
		
		System.out.println("Total:  "+total);
		
		
		
	}
	
}
