package collction;
import java.util.*;

public class RemoveDuplicate {
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
