package Function_interface;

import java.util.*;
import java.util.function.*;


class Employee1
{
	String name;
	int salary;
	
	public Employee1(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()  //if you not represent like this ..
	{
		return name+" "+salary;
	}
	
}

public class Salary_Increment {
	public static void main(String[] args) {
		
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		ArrayList<Employee1> l1 = new ArrayList<Employee1>();
		
		l.add(new Employee1("Ramesh",2000));
		l.add(new Employee1("suresh",2500));
		l.add(new Employee1("James",4000));
		l.add(new Employee1("Aravind",3600));
		System.out.println("Before Incremnt: "+ l);
		
		
		Predicate<Employee1> p=e->e.salary<3500;
		
		
		
		Function<Employee1,Employee1> f = e-> {
			
			e.salary = e.salary +477;
			return e;
		
		
		
		};
		
		for(Employee1 w: l)
		{
			if(p.test(w))
			{
				System.out.println(f.apply(w));
				l1.add(w);
			}
			
			
		}
		
		
		
		System.out.println("Incremented Salary: "+l1);
		
	}

}






