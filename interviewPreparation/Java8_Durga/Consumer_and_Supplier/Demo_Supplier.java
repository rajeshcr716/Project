package Consumer_and_Supplier;

import java.util.function.Supplier;

public class Demo_Supplier {
	public static void main(String[] args) {
		
		
		Supplier<String> s = ()->{
			
			String s1[] = {"Rolex","HMT","TITAN","REFEL"};
			
			int x = (int)(Math.random()*4 );
			return s1[x];
			
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
	}

}
