package aradhyaCenter;

public class StringContainInteger {
public static void main(String ar[]){
		
		String x= "A7862";
		char y[]=x.toCharArray();
		
		int size=y.length;
		 
		
	 
		int i=0;
		while(i!=size)
		{
			
			if(y[i]>='0' && y[i]<='9')
			{
				 
				System.out.println("Integer String");
				System.exit(0);
			}
			 
			 ++i;
		}
		 
}
 
}
