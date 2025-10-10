package collction;

 
import java.util.*;


public class ConvertArayToArayList {
 public static void main(String[] args) {
	


	 String city[] = {"Banglore","Manglore","Mysore","Hubli"};
	 String city1[] = {"chenni","nagpur","jaipur"};
   
	 System.out.println(Arrays.toString(city));//convert arrays to string
	 
	 //We are using below method to convert Array to collection or ArrayList..etc
	 List<String> ar1 = Arrays.asList(city);
     List<String> ar = new ArrayList<String>(Arrays.asList(city));
	 
     Collections.addAll(ar,city1);
	 
	 
	 System.out.println(ar);
	  System.out.println(ar.contains("Banglore"));
	  System.out.println(ar);
	 
 
}
}
