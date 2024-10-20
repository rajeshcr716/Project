package string;

public class Stringlength {
	public static void main(String ar[]){
		
		String x = "abc tech";
		//System.out.println(x.length());
		
		x = x.concat("\0");
		System.out.println(x);
		char y[]= x.toCharArray();
		
		int count =0;
		int i=0;
		
		while(y[i]!='\0')
		{
			++count;
			++i;
			
		}
		System.out.println(count);
	}

}
