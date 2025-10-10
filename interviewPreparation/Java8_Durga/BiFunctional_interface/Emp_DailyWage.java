package BiFunctional_interface;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

 
class Employee
{
	int eno;
	String name;
	double dailyWage;
	public Employee(int eno, String name, double dailyWage) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
	
	
}

class TimeSheet
{
	
	int eno;
	int days;
	public TimeSheet(int eno, int days) {
		super();
		this.eno = eno;
		this.days = days;
	}
	
	
	
}




public class Emp_DailyWage {
	public static void main(String[] args) {
		
		
		 Employee a = new Employee(101,"Ram",1200);
		 TimeSheet b = new TimeSheet(101,14);
	 
		 
		 BiFunction<Employee,TimeSheet,Double> f = (e,t) -> e.dailyWage*t.days;
		 
		 System.out.println(f.apply(a, b));
		
		 
		 
	}

}













