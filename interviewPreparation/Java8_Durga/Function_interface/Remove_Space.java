package Function_interface;

import java.util.function.*;
public class Remove_Space {
public static void main(String[] args) {
	
	String a = "Durga soft solutions";
	
	Function<String, String> f = s -> s.replaceAll(" ", "") ;
	
	 System.out.println(f.apply(a));
	
	
}
	
}
