package aradhyaCenter;

public class CountVowel {
	public static void main(String ar[])
	{
	
	String x= "Aradhya brilliance center";
	x=x.toUpperCase();
	char y[]=x.toCharArray();
	
	int size=y.length;
	
	int vowcount=0;
	int concount=0;
	int splcnt =0;
	int i = 0;
	

	while(i!=size)
	{
		if(y[i]>='A' && y[i]<='Z')
		{
			if(y[i]=='A' ||y[i]=='E' ||y[i]=='I' ||y[i]=='O' ||y[i]=='U')
			{
				++vowcount;
			}
			else
			{
				++concount;
			}
		}
	
		else 
		{
			++splcnt;
		}
	 ++i;
	}
	System.out.println(y);
	System.out.println("vowcount "+vowcount);
	System.out.println("consount "+concount);
	System.out.println("spl char "+ splcnt);

	}


}
