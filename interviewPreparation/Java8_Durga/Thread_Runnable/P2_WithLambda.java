package Thread_Runnable; 

interface Interf2
{
	public void m1(int a , int b);
}



public class P2_WithLambda{
public static void main(String[] args) {
		
	Interf2 i  = (a,b)-> System.out.println("sum with lambda "+ (a+b));
	i.m1(10, 10);
	  
}

}