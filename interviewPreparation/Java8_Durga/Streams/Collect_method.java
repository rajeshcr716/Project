package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect_method {
public static void main(String[] args) {
// WRITE AN PROGRAM TO PRINT LENGTH GREATER THAN 9 INSIDE ARRAYlIST AND PRINT IN UPPER CASE USING STREAM.	
	ArrayList<String> l = new ArrayList<String>();
	l.add("pawan");
	l.add("raviTeja");
	l.add("chiranjeevi");
	l.add("venkatesh");
	l.add("Nagarjun");
	System.out.println("Original list: " +l);
	
	
	List<String> l1 = l.stream().filter(s->s.length()>=9).collect(Collectors.toList());
	System.out.println("String with length of >+9: "+ l1+"\n");
	
	List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	
	System.out.println("String with UpperCase: "+l2);
	
	//  ---- OR
	
//	 l1.stream()
//     .filter( s -> s.length()>3)
//     .map(s -> s.toUpperCase())
//     .forEach(s -> System.out.println(s));
	
	
}
}
