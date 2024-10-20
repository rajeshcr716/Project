package Thread_Runnable;


//Wothout lambda function program look like this
class myRunnable implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("child Thread");
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) //At this point program has only one thread that Main thread. (applicable to all pgm)
	{
		
	Runnable r = new myRunnable();
	
	Thread t = new Thread(r);
	t.start(); // Now pgm has two thread one main Thread and another one is child thread.
	 
	for(int i=0; i<10; i++)
	{
		System.out.println("main Thread");
	}
		
	}

}
