package MethodAndConst_Ref;

interface a1
{
	public void m1();
}



public class WithoutRef {
public static void main(String[] args) {
	
	a1 i= () -> {
		System.out.println("Using Lambda expression");
	};
	
	i.m1();
}
	
}
