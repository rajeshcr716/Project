package Streams;

import java.util.ArrayList;

public class EvenNO_withoutStream {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(35);
		
		System.out.println("Even no in list:  "+l);
		
		for( Integer w: l)
		{
			if(w%2==0)
			{
				System.out.println(w);
			}
		}
		
	}

}
