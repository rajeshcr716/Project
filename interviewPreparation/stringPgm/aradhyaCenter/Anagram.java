package aradhyaCenter;
import java.util.Arrays;


public class Anagram {
public static void main(String ar[]){
		
		 String x = "ABCD";
		 String y = "DCBAO";
		
		 
		 char a[]= x.toCharArray();
		 char b[]= y.toCharArray();
		 
		 
		 
		 Arrays.sort(a);
		 Arrays.sort(b);
		 System.out.println(a);
		 System.out.println(b);
		 Boolean result = Arrays.equals(a,b);
		 System.out.println(result);
		 
		 if(result==true)
		 {
			 System.out.println("Strings are anagram");
		 }
		 else
		 {
			 System.out.println("Strings are not anagram");
		 }
		 
		
}
}
