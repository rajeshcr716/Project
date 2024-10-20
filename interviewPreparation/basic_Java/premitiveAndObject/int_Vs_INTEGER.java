package premitiveAndObject;

public class int_Vs_INTEGER {
	public static void main(String[] args) {
//--> premitive data type means non-object and no methods, properties for premitive data type.
		int a = 10;
		int b = 20;
	//	int c = null;   // int can not be null in java
		
// Wrapper class or java object.
	 	Integer x = 40;      // not able to store directly by default java perform auto boxing.
	 	Integer y = 40;      // auto Boxing means internally cast from int to Integer by java by default.
	 	System.out.println("comparing wrapper class(autoboxing) or java object: ");
	 	System.out.println( x==y );
        
        
        Integer a1 = 128;
        Integer b1 = 128;
    	System.out.println("comparing wrapper class or java object with out of range value: ");
        System.out.println(a1==b1);
        
        System.out.println("Wrapper class with new keyword ");
	 	Integer x1 =  new Integer(40);
	 	Integer x2 =  new Integer(40);
	 	
	 	System.out.println(x1==x2);
	 	
	 	
	 	
//	 	Autoboxing with values between -128 and 127 uses cached objects, leading to the same reference.
//	 	Using new Integer(...) always creates a new object, resulting in different references.
	 	
	 	
	 	
	 	// this one not prefered because by default java storing the value.
	 	
	 	 // Memoy location
	 	// Integer x =  new Integer(40);    Store in Heap memory
	 	// Integer x = 40;                  Store in Heap memory      
        // int x = 50;  -->                 store stack memory 
		
		
	}

}
