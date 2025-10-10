package Thread;

// learn about join method.
//main method wait untill the excustion of child thread.


class myThread3 extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			
			System.out.println("child Thread");
			//Thread.yield();
			 //it give high chance to excute the main thread.
			 //we not except exact output but preference is high for main thread.
			
		}
		
		
	}
}

class  ThreadDemo3
{
	public static void main(String args[])
	{
		
		myThread t = new myThread();
		t.start();
		//t.join();   
/*every join throws IE exception .so that we use 
 try catch (or) add throws declaration.other wise we will ger compile time error */
		 
		for(int i=0; i<=10; i++)
		{
			
			System.out.println("Main Thread");
			
		}
		
	}
	
	
}