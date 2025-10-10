package MethodAndConst_Ref;

interface b1
{
	public void m1(int i);
}

class test1
{
	public  void m2(int i)
	{
		System.out.println("From method ref: "+i);
	}
}

public class mRef_withArgs {
	public static void main(String[] args) {
		
		test1 t = new test1(); // instace method so creating class object is required.
		
		b1 i = t :: m2; // method reference is alternative expression for lambda expression. using double(::) operator.
		i.m1(10);  // m1 internally refer m2.
		
		
		// Lambda expression "test1" class is not required. but we overriding . just for refer another method like below
		
		b1 f = l -> System.out.println("From lambda exp");
		f.m1(20);
		
		
		
	}

}
