package intervew_pgms;

public class bubble_sort {
public static void main(String[] args) {
	
	
	int a[] = {10,30,20,56,45,12,0};
	
	int n = a.length;
	
	 sort(a,n);
	
	printline(a,n);
	 
}



private static void sort(int[] a, int n) {
	 
	int i,j;
	
	for(i=0; i<n; i++)
	{
		 //System.out.print( i  );
		 
		for(  j=0; j<n-1-i; j++)
		{
			
		  	//System.out.println("a[j]: "+a[j] +" > a[j+1]: "+a[j+1]);
			if(a[j]>a[j+1])
			{
				//System.out.println("true" );
				//System.out.println("a[j]: "+a[j] +"  a[j+1]: "+a[j+1]+'\n');
				
				int temp = a[j];
				a[j]=a[j+1];
				
				a[j+1]= temp;
				
			}
			else
			{
				//System.out.println("false"+'\n');
			}
	}
}
	
}


private static void printline(int[] a, int n) {
	 
	
	
	for(int i=0; i<n; i++)
	{
		//System.out.println("index: "+i);
	 
		  System.out.print(a[i]+" ");
	}
	
}












}
