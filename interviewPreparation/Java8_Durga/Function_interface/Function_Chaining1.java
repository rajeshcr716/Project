package Function_interface;

import java.util.function.Function;

public class Function_Chaining1 {
	public static void main(String[] args) {
		
		
		
		Function<String,String> f1 = s -> s.toUpperCase();
		Function<String,String> f2 = s -> s.substring(0,5);
		
		System.out.println(f1.apply("rajeshsh"));
		System.out.println(f2.apply("rajeshsh"));
		
		System.out.println(f1.andThen(f2).apply("rajeshsh"));
		System.out.println(f1.compose(f2).apply("rajeshsh"));
		
	}

}
