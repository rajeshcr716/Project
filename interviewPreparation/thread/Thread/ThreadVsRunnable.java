package Thread;


class T1 implements Runnable
{
	
	private int counter = 0;
	public void run()
	{
		
		counter++;
		System.out.println("Runnable: "+counter);
	}
	

}

class T2 extends Thread
{
	
	private int counter = 0;
	public void run()
	{
		
		counter++;
		System.out.println("Thread class: "+counter);
		
	}
	
}
 
 

 public class ThreadVsRunnable   {
	 
 public static void main(String[] args) throws InterruptedException {
	 
	 T1 r = new T1();
	 
	 Thread t = new Thread(r);
	 
	 t.start();
	 
	 Thread.sleep(1000);
	 
  Thread t1 = new Thread(r);
	 
	 t1.start();
	 Thread.sleep(1000);
	 
Thread t3 = new Thread(r);
	 
	 t3.start();
	 Thread.sleep(1000);
	 
	 T2 a1 = new T2();
	 a1.start();
	 Thread.sleep(1000);
	 
	 T2 a2 = new T2();
	 a2.start();
	 Thread.sleep(1000);
	   
	 T2 a3 = new T2();
	 a3.start();
	 Thread.sleep(1000);
 }
 }
 
 
 