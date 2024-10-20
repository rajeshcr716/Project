package Function_interface;
import java.util.*;
import java.util.function.*;

import ArrayList_with_Lambda.Employee_Object;
 


class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
	
}



public class Student_Grade {
	public static void main(String[] args) {
		
		
	 	ArrayList<Student> l = new ArrayList<Student>();
		
		 populate(l);
		 
			
		 //Below one another method we directly adding value to arrayList/list
		 /*	
			  Student[] l = { new Student("soori",53),
					  new Student("Veda",77),
					  new Student("Naredra",96), 
					  new Student("Pintu",45), };
					  */ 
			 
		   
		 
		
		Function<Student,String> f= s->{
	 
			int marks=s.marks;
			 if(marks>=80)
			 {
			 return "A[Dictinction]";
			 }
			 else if(marks>=60)
			 {
			 return "B[First Class]";
			 }
			 else if(marks>=50)
			 {
			 return "C[Second Class]";
			 }
			 else if(marks>=35)
			 {
			 return "D[Third Class]";
			 }
			 else
			 {
			 return "E[Failed]";
			 }
			 };

			
		
		for(Student w: l)
		{
			System.out.println(f.apply(w));
		}
		
		
		
		
	}

	public static void populate(ArrayList<Student> l)
	{
		l.add(new Student("Rakesh",50));
		l.add(new Student("Balayaa",75));
		l.add(new Student("SRK",94));
		l.add(new Student("Rishab",35));
		
	}
	
}
