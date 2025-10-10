package ArrayList_with_Lambda;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


// 1. we done soring with arralist and default natural sorting order. 

public class ArrayList_Sort {
	public static void main(String[] args) {
		
	
	
	ArrayList<Integer>  l = new ArrayList<Integer>();
     l.add(10);
     l.add(20);
     l.add(05);
     l.add(9);
     l.add(14);
	
   System.out.println("before sort"+l);
 Collections.sort(l);  //default natural sorting 
  
 
 
   System.out.println("after sort"+l);
	}
	

}
