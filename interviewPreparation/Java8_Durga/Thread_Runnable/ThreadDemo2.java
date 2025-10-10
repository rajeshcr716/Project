package Thread_Runnable;



public class ThreadDemo2 {
	public static void main(String[] args) {
		
		
		//ADD ";" at the end lambda expression this is new .In the pgm  Runnable is interface.. and myrunnable/any method which implement the  Runnable interface
		//so we taken that implemented method in the lambda expression. no modifier , no return type , no method name in lambda (just Revise)
				
		
		Runnable r = () -> { for(int i=0; i<10; i++) {  System.out.println("child Thread"); } };
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++)
		{
			 
			System.out.println("main Thread");
		}
	
		
		}
	}

	 