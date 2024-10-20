package collection2;

import java.util.*;

public class IteratorDemo {
	public static void main(String ar[])
	{
 // it read and remove the object from the collection 
//ex we only count and remove the apple in apple box.but not replaceable 
		 ArrayList l = new ArrayList();
		 for(int i=0; i<=10; i++)
		 {
			l.add(i);  
		 }
		
		 System.out.println(l);//[0,1,2,3.....10]   
	
	Iterator itr =l.iterator();
	while(itr.hasNext()){
		Integer n = (Integer)itr.next();
		
		if(n%2==0)
		// System.out.println(n); 
			itr.remove();  //it remove or delete even no
			 
		
		
	}
	
	System.out.println(l);
	
	
	
	}
}
