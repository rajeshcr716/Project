package string;

public class Palindrome {
	public static void main(String ar[]){
		String x= "Abc tech";
		char y[]=x.toCharArray();
		
		int size=y.length;
		 
		System.out.println(size);
		char a[] = new char[size];
		int i=0;
		while(i!=size)
		{
			a[size-1-i]=y[i];
			//System.out.println(a);
			++i;
			
		}
	    i=0;
	    while(i!=size)
	    {
	    	if(a[i]!=y[i])
	    	{
	    		System.out.println("Not an palindrome");
	    		System.exit(0);
	    	}
	    	else 
	    	{
	    		++i;
	    		continue;
	    	}
	    }
	  System.out.println("palindrome");
	
	
	}
	 
}
