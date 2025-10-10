package Consumer_and_Supplier;

import java.util.ArrayList;

import java.util.function.*;

 

class Student1
{
	String name;
	int marks;
	public Student1(String name, int marks) {
	 
		this.name = name;
		this.marks = marks;
	}
	
}

 

public class Student_Information {
	public static void main(String[] args) {
		
		
		ArrayList<Student1> l = new ArrayList<Student1>();
		 populate(l);
		 
		 
		 Predicate<Student1> p = s->s.marks>=65;
		 
		 
		 Function<Student1,String> f= s->{
			 
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
				 
				 
				 
				 Consumer<Student1>c = s->{
					 System.out.println("name: "+s.name);
					 System.out.println("marks: "+s.marks);
					 System.out.println("Grade: "+f.apply(s));
					 System.out.println();
				 };
				 
				 

				 
				 for(Student1 w: l)
				 {
					 if(p.test(w))
					 {
						 c.accept(w);
					 }
					 
					 
				 }
		 
		 
		 
		 
		
		
	}

	private static void populate(ArrayList<Student1> l) {
		l.add(new Student1("Rakesh",50));
		l.add(new Student1("Balayaa",75));
		l.add(new Student1("SRK",94));
		l.add(new Student1("Rishab",35));
		
	}

}
