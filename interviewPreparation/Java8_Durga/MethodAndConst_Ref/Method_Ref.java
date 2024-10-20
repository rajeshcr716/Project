package MethodAndConst_Ref;

import java.util.*;
 
 
interface b2{
	public void m1();
}

class Demo{
	public void m2()
	{
		System.out.println("Instance method outside main class");
	}
}

class trt
{
	public static void m3()
	{
		System.out.println("STATIC METHOD out side main");
	}
	
}


public class Method_Ref {
	public static void main(String[] args) {
		Demo d = new Demo();
		
		 b2 i = d::m2;
		 i.m1();
		
		 b2 j = trt::m3;
		 j.m1();
		 
		 
	}

}













