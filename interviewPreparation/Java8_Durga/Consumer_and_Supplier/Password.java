package Consumer_and_Supplier;

import java.util.function.Supplier;

public class Password {
	public static void main(String[] args) {
		
		
		Supplier<String> c = ()->{
			String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			int digit = (int)(Math.random()*10);
			String pwd="";
			
			
			for(int i=1; i<=8; i++)
			{
				if(i%2==0)
				{
					pwd = pwd+digit;
				}
				else
				{
					pwd = pwd+symbols.charAt( (int)(Math.random()*29));
				}
				
				
			}
			return pwd;
			};
			
			System.out.println(c.get());
			System.out.println(c.get());
			System.out.println(c.get());
			
			
			
			
			
			
		
		
	 
}
}
