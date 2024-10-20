package string;

public class ReverseString {
public static void main(String ar[]){
		
		String x= "Abc tech";
		char y[]=x.toCharArray();
		
		int size=y.length;
		 
		System.out.println(size);
		char a[] = new char[size];
		int i=0;
		while(i!=size)
		{
			a[size-1-i]=y[i];
			System.out.println(a);
			++i;
			
		}
		System.out.println(y);
		System.out.println(a);
		
	}
}
