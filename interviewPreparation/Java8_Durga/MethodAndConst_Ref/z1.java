package MethodAndConst_Ref;

class plane
{
	String s;
	plane(String s)
	{
		this.s = s;
		
		System.out.println(s+"Constructor called from interface main method"); 
	}
}





public interface z1 {
	
	public plane m1(String s);  // in that return type will be must and should be object type.
	
	public static void main(String[] args) {
		
		z1 i = plane :: new;
		
		i.m1("Calling constructor interface main method: -->");
		
		
	}

}
