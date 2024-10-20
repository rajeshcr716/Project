package Thread;
 

class SleepMethod
{
public static void main(String ar[]) throws InterruptedException
{
	for(int i=0; i<=10; i++)
	{
		System.out.println("Main Thread");
		Thread.sleep(2000); //thorws IE exception
	}
	
}
	
	
	
	
}