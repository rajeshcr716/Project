package Default_and_Static;

 
interface Interf
{
	 
	default void m1()
	{
		System.out.println("Default method");
	}
}



public class Demo implements Interf {

	
	//We can Over ride the default method present in the interface..
	
	 
	/*
	 * public void m1() { System.out.println("modified"); }
	 * 
	 */
	
	public static void main(String[] args) {
	 
	
	Demo d = new Demo();
	d.m1();
	
	
}
}
