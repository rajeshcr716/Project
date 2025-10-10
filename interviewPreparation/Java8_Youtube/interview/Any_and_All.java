package interview;

import java.util.stream.Stream;

public class Any_and_All {
	public static void main(String[] args) {
		
 /*
  input = [2,4,5,6,8] 
  output = all numbers are not div.. by 2
  
  appy -> AllMatch condition in pipeline
  */

 boolean divByTwo =  Stream.of(2,4,5,6,8).allMatch(s->s%2==0);		
		
		
if(divByTwo)
{
	System.out.println("All numbers are divisble by 2");
}
	else
 {
		System.out.println("All numbers are not divisble by 2");
 }
		
/*
input = [2,4,5,6,8] 
output = all numbers are  div.. by 2

appy -> AnyMatch condition in pipeline
*/
		

boolean divBy2 =  Stream.of(2,4,5,6,8).anyMatch(s->s%2==0);	
	
if(divBy2)
{
	System.out.println("any numbers are divisble by 2");
}
	else
 {
		System.out.println("Any numbers are not divisble by 2");
 }
	
	
	}
 
 }
