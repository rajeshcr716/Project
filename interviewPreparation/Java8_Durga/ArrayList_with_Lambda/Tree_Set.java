package ArrayList_with_Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class m3 implements Comparator<Integer>
{

	public int compare(Integer I1, Integer I2) {
		if(I1>I2)
		{
			return -1;
		}
		else
			if(I1<I2)
			{
				return +1;
			}
			else
			{
				return 0;
			}
		 	}
 }

public class Tree_Set {
	public static void main(String[] args) {
		
		
		
	// 1st one default sorting order .
	// 2nd one customize soring using  Comparator Concept, Lambda expression () -> { } and Ternary Operator.
	// Comparator,Lambda expression,Ternary Operator ---> 3 Concept .. otherwise we need pass  **new m1()** means separate implemented class needed.	
	
	TreeSet<Integer>  l = new TreeSet<Integer>();
	//TreeSet<Integer>  l = new TreeSet<Integer>(new m3()); //we're passing comparator implemented  method  inside Treeset.   
	//TreeSet<Integer>  l = new TreeSet<Integer>((I1,I2) -> (I1>I2)? -1 : (I1<I2)? +1 : 0 );
    l.add(10);
    l.add(20);
    l.add(05);
    l.add(9);
    l.add(14);
     
  System.out.println(" sort"+l);
	}

}


