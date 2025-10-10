package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stringSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Cherry");

        // Sort in descending order using Stream API
        List<String> sortedStringsDesc = strings.stream()
                                                .sorted((s1, s2) -> s1.compareTo(s2)) // Custom comparator for descending order
                                                .collect(Collectors.toList());
      // ---OR
//   	 l1.stream()
//	   .sorted((s1,s2) -> s2.compareTo(s1) )
//	   .forEach(s -> System.out.println(s));
        
        
        System.out.println("Sorted Strings (Descending): " + sortedStringsDesc);
    }
}
