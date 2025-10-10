package ArrayList_with_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 2. customize soring of Arralist with Comparator Interface
class m1 implements Comparator<Integer>
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


public class ArrayList_Comparator {
	public static void main(String[] args) {
		

		ArrayList<Integer>  l = new ArrayList<Integer>();
	     l.add(10);
	     l.add(20);
	     l.add(05);
	     l.add(9);
	     l.add(14);
		
	   System.out.println("before sort"+l);
	     Collections.sort(l,new m1());  //In that we pass **new m1()** this is implemented class of comparator interace. in that we did customize soring order.
	  //Collections.sort(l);
	   
	   System.out.println("after sort"+ l );
		
		
		
	}

}
