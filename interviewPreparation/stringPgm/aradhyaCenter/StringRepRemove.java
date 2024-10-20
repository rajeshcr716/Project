package aradhyaCenter;

public class StringRepRemove {
	public static void main(String ar[]){
		
	 
		
		String x ="Abc ATY";
		
		x=x.replace("A","1");//replace("origial","replace String");--->replace String 
		
		System.out.println(x); 
	
		// Remove char 'e' in whole string and replace 's' to 'n' .
		
		String y ="computer sceinces ";
		String z="";
		char a[]=y.toCharArray();
		int size=y.length();
		
		for(int i=0; i<size;++i)//-------->remove specific char acter 
		{
			 
			if(a[i]!='e' &&a[i]!='s')
			{
				z=z+a[i];
			}
			 else if(a[i]=='s')
			{
				z=z+'n';
			} 
			
			
			
		}
		
		 
		
		 
		System.out.println(z); 
		
	}
}
