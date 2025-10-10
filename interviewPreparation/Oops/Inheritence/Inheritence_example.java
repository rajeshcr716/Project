package Inheritence;

class A{
	
	public void m1(){
		System.out.println("m1 method");
	}
}

class B extends A{
	
}



public class Inheritence_example {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}

	//This program demonstrate the basic example inheritence.
}
