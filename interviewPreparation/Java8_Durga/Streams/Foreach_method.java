package Streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Foreach_method {
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		//
		
		
		l.add("A");
		l.add("BB");
		l.add("CCC");
		
		l.stream().forEach(s->System.out.println(s));
		System.out.println();
		l.stream().forEach(System.out::println);
		
		
		
		Consumer<String> c = s -> System.out.println(s);
		
		for(String w: l)
		{
			//System.out.println("using consumer : " +l);
		}
		
		
		
	}

}
