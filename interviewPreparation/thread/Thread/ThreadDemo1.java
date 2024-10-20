package Thread;

// learn about extend Thread and yield method.


class myThread extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			
			System.out.println("child Thread");
			Thread.yield();
			 //it give high chance to excute the main thread.
			 //we not except exact output but preference is high for main thread.
			
		}
		
		
	}
}

class  ThreadDemo1 
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