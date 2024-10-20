package interviewProgram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Streams.Foreach_method;
import Streams.stream_method;

class m1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		 
		if(o1>o2)
		{
			return 1;
		}
		else if (o1 < o2) {
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}


public class test {
	

	
public static void main(String[] args) {

	List<Integer> l1 = Arrays.asList(1,2,3,5,4,24,121,322);
	
	Collections.sort(l1, new m1());    // rember create a class outside public class.
	
//	Collections.sort(l1);
 System.out.println(l1);
	
}

}