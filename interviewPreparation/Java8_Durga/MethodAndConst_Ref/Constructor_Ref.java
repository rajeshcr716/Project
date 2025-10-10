package MethodAndConst_Ref;


class sample
{
	String s;
	sample(String s)
	{
		this.s = s;
		
		System.out.println(s+"Constructor called"); 
	}
}

interface c1
{
	public sample m1(String s);
	
}


public class Constructor_Ref {
	public static void main(String[] args) {
		
		c1 i = sample::new;
			
			i.m1("calling constructor");
		}

}
