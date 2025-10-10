package Ternary_Operator;

public class Largest_of_three {
public static void main(String[] args) {
	
	int n1 = 20 , n2 = 50 , n3= 30 ;
	
	System.out.println("numbers "+n1+"  "+n2+ " "+ n3);
	
	int largest = (n1>n2)? (n1>n3? n1:n3): (n2>n3? n2:n3);
	
	System.out.println("Largest number is : "+largest);
	
	
}
}

/*
 * normal pgm 
 * if(a>=b && a>=c) 
 * System.out.println(a+" is the largest Number");
 * 
 * else if (b>=a && b>=c)
 * System.out.println(b+" is the largest Number"); 
 *  
 * else
 * 
 *System.out.println(c+" is the largest number"); }
 */