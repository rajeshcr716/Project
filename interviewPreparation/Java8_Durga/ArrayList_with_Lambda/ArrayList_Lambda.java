package ArrayList_with_Lambda;

import java.util.ArrayList;
import java.util.Collections;

//3.ArrayList with Comparator . but in that we're using Lambda expresion in the Ternary Operator.

public class ArrayList_Lambda {
	public static void main(String[] args) {

		ArrayList<Integer>  l = new ArrayList<Integer>();
	     l.add(10);
	     l.add(20);
	     l.add(05);
	     l.add(9);
	     l.add(14);
		
	   System.out.println("before sort"+l);
	     Collections.sort(l, (I1,I2) ->  (I1>I2)? -1: (I1<I2)? +1  : 0  );  
	    //  Collections.sort(l, (I1,I2) ->  I1.compareTo(I2)  ); 
	     //In that we pass **new m1()** this is implemented class of comparator interace. in that we did customize soring order.
	  
	   
	   System.out.println("after sort"+ l );
		
	}

}
