package Function_interface;
import java.util.function.*;
public class Count_Space {
public static void main(String[] args) {
	
	
	
	// number of space = (String length with space) - (String length without space)
	
	String a = "Durga soft solutions";
	
	Function<String, Integer> f = s ->s.length() - s.replaceAll(" ", "").length();
	
	System.out.println("Number of space in Stringa: " + f.apply(a));
	
}
}
