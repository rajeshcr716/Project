package OverLoading_vs_Roading;

class A
{
	public void m1(int a){ // most priority
		System.out.println("integer method");
	}
	
	public void m1(String s){
		System.out.println("String method");
	}
	
	public void m1(int ...i){ //least priority
		System.out.println("multiple argument accepted");
	}
}


public class OverLoading {
	public static void main(String[] args) {
		A a = new A();
		a.m1(10);
		a.m1("raje");
		a.m1(10,20,30);
		a.m1(10);
	}

	/* If class contain two or more method having same method name with different argument type is called
	 method overLoading.
	 here there are method for int type arg one is for single and second one accept multiple argument but
	   if we give single then it will consider as single int method.

	    In method overloading method resolution is taken care by compiler*/
}
