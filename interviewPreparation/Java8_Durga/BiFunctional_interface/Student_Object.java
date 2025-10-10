package BiFunctional_interface;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.*;

class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		 
		this.name = name;
		this.marks = marks;
	}
	
	 
	
	
}





public class Student_Object {
	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		
		BiFunction<String,Integer,Student> f = (name,rollno)-> new Student(name,rollno);
		
		l.add(new Student("Durga",87));
		l.add(new Student("Ravi",47));
		l.add(new Student("Suri",67));
		
		
		
		System.out.println(l);    // it is little confuse.. When object came we need to use toString() in Student class. we created our own object using new..
		
		Consumer<Student> c = s -> {
			System.out.println(s.name);	
			System.out.println(s.marks);
		
	
		};
		
	 
		
		for (Student s: l)
		{
			c.accept(s);                  // for this toString() will not affect Consumer will print the value
			//System.out.println(s.name);   // just print.. without toString() it will not work.. Student class toString with return type must required. 
			//System.out.println(s.marks); //
		}
		
		
	}

}
