package collection2;

import java.util.*;

public class EnumerationDemo {
	public static void main(String ar[])
	{
    
		 
		Vector v = new Vector();
		 for(int i=0; i<=10; i++)
		 {
			 v.addElement(i);
		 }
		
		 System.out.println(v);//[0,1,2,3.....10]   
	
	
	Enumeration e = v.elements();
	while(e.hasMoreElements())
	{
		Integer I = (Integer)e.nextElement(); 
		if(I%2==0)
	  System.out.println(I);//0,2,4,6,8,10
			
	}
	
	System.out.print(v);
	
	}	
	
}
