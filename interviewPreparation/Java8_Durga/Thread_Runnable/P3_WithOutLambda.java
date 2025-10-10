package Thread_Runnable;
interface Interf3
{
	public int  getLength(String s);
}

class demo3 implements Interf3{

	 
	public int getLength(String s) {
		
		return s.length();
		
		
	}
	
	
}




public class P3_WithOutLambda {
	public static void main(String[] args) {
		
		Interf3 i = new demo3();
		
		System.out.println(i.getLength("hello"));
	}

}
