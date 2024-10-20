package Immutable_class;

public class Test {

	final int i; 
	
	
	
	public Test(int i) {
		super();
		this.i = i;
	}

	
	public Test modify(int i)
	{
		
		if(this.i==i)
		{
			return this;
		}
		else 
		{
			return new Test(i);
		}
		
		 
		
	}


	public static void main(String[] args) {
		
		Test t1 = new Test(10);
		 
		Test t2 = t1.modify(10);
		System.out.println("hashcod of t1: "+t1.hashCode());
		
		System.out.println("hashcod of t2: "+t2.hashCode());
		
	}
}
