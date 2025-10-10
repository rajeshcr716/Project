package Default_and_Static;

interface Left
{
	default void m1()
	{
		System.out.println("Left ");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("Right");
	}
}


public class Mul_Demo implements Left,Right{
	public void m1()
	{
		 // System.out.println("My own implementaion");
		 Left.super.m1();
		 Right.super.m1();
	}
	 
	public static void main(String[] args) {
		 Mul_Demo d = new Mul_Demo();
		 
		  d.m1();
	}
	//Both interface having same method then we need to mention which interface . inside overing method mention  "name.super.method()"
	

}
