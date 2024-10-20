package string;

public class equal {

	
// both are same but == mainly look for location stack to stack --> true 
// stack to heap location returns false.. 
//variable stored in stack and object stored in heap.

	public static void main(String[] args)
	    {
	        
		
		 System.out.println("Variable stored in stack"+'\n');
		
		   String s1 = "HELLO";
	        String s2 = "HELLO";
	       
	  
	        System.out.println(s1 == s2); // true
	       
	        System.out.println(s1.equals(s2)); // true
 
	        System.out.println(1==1);
	     
	        
	        System.out.println('\n'+"Object stored heap using New keyword"+'\n');
	        
	        String s3 =  new String("123");
	        String s4 =  new String("123");
	        
	        
	        System.out.println(s1 == s3); // false
	        System.out.println(s3.equals(s4)); // true 
	        System.out.println(s3 == s4); // true 
	        System.out.println(s3 == s3); // true 
	        
// StringBuffer will not overide Equals() method. so it not work only work
// when compare object itself it returns true. for "==" operator also.
	        
	        
	        StringBuffer a1 = new StringBuffer("123");
	        StringBuffer a2 = new StringBuffer("123");
	        
	        System.out.println('\n'+"Object stored in String Buffer(heap memory)"+'\n');
	        System.out.println('\n'+"String buffer will not overide equal method so it will not work" );       
	        System.out.println( "it work only when you compare itself");
	        System.out.println( "same applicabe for == operator also"+'\n');
	        System.out.println(a1.equals(a2)); // true 
	        System.out.println(a1 == a2); // true 
	        
	        System.out.println(a1.equals(a1)); // true 
	        System.out.println(a1 == a1); // true 
	    }
	
}
