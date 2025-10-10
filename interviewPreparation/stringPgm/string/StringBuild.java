package string;

public class StringBuild {
public static void main(String ar[]){
		
		//String is mutable 
		
		StringBuilder x = new StringBuilder("ABC");
		 StringBuilder y = new StringBuilder("   TECH");
		
		 x.append(y);
		System.out.println(x);  //String is mutable-->ABCTECH
		
	}
}
