package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	
	private   String name;
	private   int age;
	private   String gender;
	private   String department;
	
	
	public Employee(String name, int age, String gender, String department) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	 

//without setter and getter not able to excute pipeline..for object type.
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("ABC",30,"FEMALE","HR"));
		employees.add(new Employee("PQR",25,"MALE","IT"));
		employees.add(new Employee("LMN",30,"MALE","HR"));
		employees.add(new Employee("XYZ",28,"FEMALE","IT"));
		
		 
		 
//print the department of employee ( no duplicate).		
		employees.stream()
		 .map(x->x.getDepartment() )
		 // .map(Employee::getDepartment)
		   .distinct().forEach(System.out::println);
		 
//count the employee in each department
		
		
		Map<String,Long> empcount = 	
		employees.stream()
	    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("count the employee: ");
		System.out.println(empcount);
		
		
// findout average age of male and female employee.
		
//collect the employee gender , group by average age finally store in <string , Double>
		
 Map<String, Double > aveAge = employees.stream()
.collect(Collectors.groupingBy(Employee::getGender,
		Collectors.averagingInt(Employee::getAge)));
		
		
System.out.println("Average age: "+aveAge);

 
		
		
		
	}

	
	
}












