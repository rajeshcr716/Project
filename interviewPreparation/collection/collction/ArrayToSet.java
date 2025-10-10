package collction;

 
//Array to Set

import java.util.*;
import java.util.stream.*;

public class ArrayToSet {

 

 public static void main(String args[])
 {
     // Create an Array
     String array[]
         = { "Geeks", "forGeeks", "A Computer Portal" };

     // Print the Array
     System.out.println("Array: " + Arrays.toString(array));

     // convert the Array to Set
   
     Set<String> set =  new HashSet<String>(Arrays.asList(array));
    

     // Print the Set
     System.out.println("Set: " + set);
 }
}