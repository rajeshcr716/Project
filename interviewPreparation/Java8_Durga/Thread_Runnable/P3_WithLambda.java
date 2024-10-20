package Thread_Runnable;
interface Interf4
{
	public void getLength(String s);
}




public class P3_WithLambda {
public static void main(String[] args) {
	
	Interf4 i = (s) -> System.out.println(s.length());
	i.getLength("hello");
	
}
}
