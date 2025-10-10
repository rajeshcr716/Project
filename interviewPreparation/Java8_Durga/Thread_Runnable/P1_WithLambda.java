package Thread_Runnable;

interface Interf
{
	public void m1();
}

class Demo implements Interf
{
 public void m1() 
 {
	 System.out.println("m1 method");
	
}
}

public class P1_WithLambda{
public static void main(String[] args) {
		
	Interf i = new Demo();  //  Interf refrence object with Demo object. we can  Demo ref object with Demo reference. 
	i.m1();

    Demo d = new Demo();  // using Demo reference also we can call but ..in lambda it not work.
    d.m1();

}
	
}