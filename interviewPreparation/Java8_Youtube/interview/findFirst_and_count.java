package interview;
import java.util.*;
public class findFirst_and_count {
	public static void main(String[] args) {
	     List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
         myList.stream()
               .findFirst()
               .ifPresent(System.out::println);
         
         
 //count the element in the string --> (or) long count = myList.stream().count();
         
     
 System.out.println("Count the no of element: "+  myList.stream().count()); 
         
	}

}
