package ArrayList_with_Lambda;
import java.util.*;
public class Tree_Map {
	public static void main(String[] args) {
   
	
	// 1st one default sorting order .
	// 2nd one customize soring using  Comparator Concept, Lambda expression () -> { } and Ternary Operator.
	// Comparator,Lambda expression,Ternary Operator ---> 3 Concept .. otherwise we need pass  **new m1()** means separate implemented class needed.
		
    
		// TreeMap<Integer,String> m = new TreeMap<Integer,String>();
		 TreeMap<Integer,String> m = new TreeMap<Integer,String>( (I1,I2) -> (I1>I2)? -1 : (I1<I2)? +1 : 0 );
		 
		 m.put(100, "Johny");
		 m.put(400, "alex");
		 m.put(300, "trony");
		 
		 m.put(200, "Dany");
		 System.out.println(m);
	}

}
