package Thread;

class myThread1  implements Runnable  
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			
			System.out.println("child Thread");
			 
			
		}
		
		
	}
}

class  ThreadDemo2 
{
	public static void main(String args[])
	{
		
		myThread t = new myThread();
		t.start();
		for(int i=0; i<=10; i++)
		{
			
			System.out.println("Main Thread");
			
		}
		
	}
	
	
}