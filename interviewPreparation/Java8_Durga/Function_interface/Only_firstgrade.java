package Function_interface;
import java.util.*;
import java.util.function.*;

class Student1
{
	String name;
	int marks;
	public Student1(String name, int marks) {
		 
		this.name = name;
		this.marks = marks;
	}
	 
	  public String toString() { return name; }
	  
}




public class Only_firstgrade {
	public static void main(String[] args) {
		
		ArrayList<Student1> l = new ArrayList<Student1>();
		 populate(l);
		
		 
		 
	 
		
		Function<Student1,String> f = s->{
			
			 int marks = s.marks;
			 if(marks>=80)
			 {
			 return s.name+ "\n"+"A[Dictinction]"+'\n';
			 }
			 else if(marks>=60)
			 {
			 return s.name+ "\n"+"B[First Class]"+'\n';
			 }
			 else if(marks>=50)
			 {
			 return s.name+ "\n"+"C[Second Class]"+'\n';
			 }
			 else if(marks>=35)
			 {
			 return s.name+ "\n"+"D[Third Class]"+'\n';
			 }
			 else
			 {
			 return "E[Failed]";
			 }
			 };
		 
			 
			 
			 Predicate<Student1> p= s->s.marks>60;
			 
			 for (Student1 w: l )
			 {
				 if(p.test(w))
				 {
					 System.out.println(f.apply(w));
					 
					 
					 
					 
					  
				 }
			 }
		
		
		
		
		
		
	}
	public static void populate(ArrayList<Student1> l)
	{
		l.add(new Student1("Rakesh",50));
		l.add(new Student1("Balayaa",75));
		l.add(new Student1("SRK",94));
		l.add(new Student1("Rishab",35));
		
	}

}










