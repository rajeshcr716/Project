package MethodAndConst_Ref;

interface a2
{
	public void m1();
	
}

class test
{
	public  void m1()
	{
		System.out.println("Calling instance  method ref outside public class");
	}
}
 


public class WithRef {
	public static void m1() {
		System.out.println("Calling static   method Reference inside public class");
	}
	
	
	
	
	public static void main(String[] args) {
		test t = new test();
		
		a2 i = t :: m1;
		
		i.m1();
		
		
		a2 i1 = WithRef :: m1;
		i1.m1();
		 
	}

}
