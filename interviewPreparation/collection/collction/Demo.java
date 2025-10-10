package collction;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		
 //Write an program to iterate a Arralist
   ArrayList<Integer> al = new ArrayList<Integer>();
 
     al.add(34);
     al.add(78);
     
     al.add(56);
     al.add(19);
     System.out.println("num:  "+al);
     System.out.println(al.contains(10));
      
     System.out.println(al.indexOf(56));
   for( Integer num: al)
   {
	  // System.out.println("num:  "+num);
   }
		
		
	}
	
	
}
