package BiFunctional_interface;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Bi_Predicate {
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> c = (s1,s2)-> (s1+s2)%2==0;
		
		System.out.println(c.test(10, 20));
			
		
	}

}
