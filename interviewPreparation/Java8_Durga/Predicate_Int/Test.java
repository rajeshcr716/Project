package Predicate_Int;

import java.util.function.Predicate;

public class Test {
public static void main(String[] args) {
	
	//Using predicate interface we can check boolean result in one line.
	// but it's new feature declaration is different . look like complex.
	
	Predicate<Integer> p = a-> a>10;
	System.out.println(p.test(100));
	System.out.println(p.test(5));
	 
	
	
}
}
