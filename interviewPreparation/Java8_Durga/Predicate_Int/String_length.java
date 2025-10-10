package Predicate_Int;

import java.util.*;
import java.util.function.Predicate;




public class String_length {
	public static void main(String[] args) {
		

	
		
	Predicate<String> p = s-> s.length()>5;
	
	System.out.println(p.test("abcdef")); //True length is 6
	System.out.println(p.test("abc"));  //False length is 3
	
	
	//In that we passing list of String so added inside for loop
	
	String x[] = { "abc", "abcdefg", "ghrsog","ab"};
	for(String check: x)
	{
		System.out.println(p.test(check));
		System.out.println(p.negate().test(check));
	}
	
	
	//we can also parameter and  create a new mehod inside for each loop also another method ... 
	
	
	
	}

}
