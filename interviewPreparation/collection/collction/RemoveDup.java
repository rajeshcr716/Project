package collction;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		
		li.add("mango");
		li.add("orange");
		li.add("apple");
		li.add("mango");
		 
		System.err.println(li );
		
	    Set<String> S  = new LinkedHashSet<String>(li);
		System.out.println(S);
}
}