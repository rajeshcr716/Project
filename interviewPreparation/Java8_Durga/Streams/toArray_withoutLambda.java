package Streams;

import java.util.ArrayList;

public class toArray_withoutLambda {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(5);
        l.add(35);

        System.out.println("List: " + l);

        // Convert ArrayList to Integer array
        Integer[] array = new Integer[l.size()]; // Create an array of the same size
        l.toArray(array); // Fill the array with elements from the ArrayList

        // Print the array
        for (Integer w : array) {
            System.out.println(w);
        }
    }
}
