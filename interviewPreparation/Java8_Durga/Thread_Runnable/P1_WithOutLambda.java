package Thread_Runnable;
@FunctionalInterface
  interface a1
{
	public void m1();  // contain must and should 1 abstract method.
}

/*
 * class Demo implements Interf { public void m1() { System.out.println("m1"); }
 * }
 */




public class P1_WithOutLambda {
public static void main(String[] args) {
	
	a1  i = ()-> System.out.println("m1 method  ");
	
	i.m1();
	
	
}
}
