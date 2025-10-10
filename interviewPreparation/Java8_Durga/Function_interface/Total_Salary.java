package Function_interface;

import java.util.ArrayList;
import java.util.*;
import java.util.function.*;

class Employee
{
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class Total_Salary {
	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		
	  Function<ArrayList<Employee>,Double> f = s->{
		  double total =0;
		  for(Employee w: l)
		  {
			  total = total + w.salary; //w.salry means inside employee[0],employee[1],......employee[n].
			                            //employee[0]-->contains name = "Bunny" and salry = 2000 so ..we declared.. w.salary.
		  }
		return total;
		 
		  
	  };
	  
	  System.out.println("Total salry of All employee:  "+f.apply(l));
	
	
	
	}

	
	
	
	
	private static void populate(ArrayList<Employee> l) {
		  l.add(new Employee("Bunny",2000));
		  l.add(new Employee("Chinny",3000));
		  l.add(new Employee("Pinny",4000));
		  l.add(new Employee("Vinny",5000));


		
	}

}










