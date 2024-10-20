package Thread_Runnable;
interface Intrf
{
	public void m1(int a, int b);
}

class Demo1 implements Intrf
{
	@Override
	public void m1(int a, int b) {
	 
		 System.out.println("sum without Lambda "+ (a+b));
		
	}
}


public class P2_WithOutLambda{
	public static void main(String[] args) {
		
		 Intrf i = new Demo1();
		 i.m1(10, 10);
		
		
	}
}