package BiFunctional_interface;

import java.util.ArrayList;

public class test {
	public static <E> void main(String[] args) {
		
		
		 ArrayList<E> l = new ArrayList<E>();
		 l.add(10, null);
		 l.add((E) "20");
		 System.out.println(l);
		 
	}

}
