package collction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertArayToArayList {
 public static void main(String[] args) {
	


	 String city[] = {"Banglore","Manglore","Mysore","Hubli"};
	 String city1[] = {"chenni","nagpur","jaipur"};
	
	 
	 
	 
	 System.out.println(Arrays.toString(city));//convert arrays to string
	 ArrayList<String> ar = new ArrayList<String>(Arrays.asList(city));
	 Collections.addAll(ar,city1);
	 System.out.println(ar);
	  System.out.println(ar.contains("Banglore"));
	  System.out.println(ar);
	 
    
}
}
