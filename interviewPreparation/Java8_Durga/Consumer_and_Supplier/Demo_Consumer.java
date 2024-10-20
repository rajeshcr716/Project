package Consumer_and_Supplier;

import java.util.function.Consumer;

public class Demo_Consumer {
	public static void main(String[] args) {
		
		Consumer<String> c = s->System.out.println(s);
		c.accept("Hello");
		c.accept("Durga soft");
		
		
		
	}

}
  