package string;

public class StringBuf {
	public static void main(String ar[]){
		
		//String is mutable 
		
		StringBuffer x = new StringBuffer("ABC");
		 StringBuffer y = new StringBuffer("  TECH");
		
		 x.append(y);
		System.out.println(x);  //String is mutable-->ABCTECH
		
	}
}
