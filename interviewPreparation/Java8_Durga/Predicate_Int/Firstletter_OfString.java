package Predicate_Int;

import java.util.function.Predicate;

public class Firstletter_OfString {
	public static void main(String[] args) {
		
		
		String x[] = {"Bunny","Kajal","Mallika","Katrina","Kareena"};
		
		Predicate<String> p = s ->s.charAt(0)=='K'; // don't mention char in double quote it means it will be string 
		
		System.out.println(p.test("Rajesh")); // sample direct input
		
		m1(p,x);  // pass predictor and input array x.
	}
		public static void m1(Predicate<String> p , String x[]) //accept the two input parameter  
		{
			
			for(String check: x) // iterate String object any name "check" iterate object x. type "String"
			{
				if(p.test(check)) //use 2nd parameter "p" predicate type like p1,p2,p3...etc
				{
					 
					System.out.println("Name Start with K are:  "+check); // it it true then it will be excuted.
				}
			}
		}
		
		
	}


