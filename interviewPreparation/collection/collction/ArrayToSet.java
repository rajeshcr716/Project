package collction;

 
//Array to Set

import java.util.*;
import java.util.stream.*;

public class ArrayToSet {

 // Generic function to convert an Array to Set
 public static <T> Set<T> convertArrayToSet(T array[])
 {

     // Create an empty Set
     Set<T> set = new HashSet<>();

     // Iterate through the array
     for (T t : array) {
         // Add each element into the set
         set.add(t);
     }

     // Return the converted Set
     return set;
 }

 public static void main(String args[])
 {
     // Create an Array
     String array[]
         = { "Geeks", "forGeeks", "A Computer Portal" };

     // Print the Array
     System.out.println("Array: "
                        + Arrays.toString(array));

     // convert the Array to Set
     Set<String> set = convertArrayToSet(array);

     // Print the Set
     System.out.println("Set: " + set);
 }
}