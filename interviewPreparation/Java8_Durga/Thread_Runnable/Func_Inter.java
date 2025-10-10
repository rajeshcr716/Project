package Thread_Runnable;
 
interface Intrf1
{
	public void m1(int a);
	//public void m2(int b);
}


public class Func_Inter {
	public static void main(String[] args) {
		
		Intrf1 i = (a) -> { System.out.println(a);};
		
		i.m1(10);
		
	}

}
