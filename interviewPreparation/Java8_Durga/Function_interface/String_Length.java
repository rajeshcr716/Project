package Function_interface;
import java.util.function.*;
public class String_Length {
	public static void main(String[] args) {
		
		
		
	   Function<String, Integer> f = s ->s.length();
	   
	   System.out.println(f.apply("Durga"));
	   
	   System.out.println(f.apply("SRK"));
	   
		
	}

}
