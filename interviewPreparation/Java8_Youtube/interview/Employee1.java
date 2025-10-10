package interview;
import java.util.*;
import java.util.stream.Collectors;

public class Employee1 {
	
	int id;
	String name;
	int age;
	
    int salary;

	public Employee1(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	 


@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}



//write a program to print age > 50 . and print with Name only.


public static void main(String[] args) {
	
	List<Employee1> emp =  new ArrayList<Employee1>();
	emp.add(new Employee1(1, "Rajesh", 25, 12000));
	
	emp.add(new Employee1(2, "Mahesh", 55, 92000));
	emp.add(new Employee1(3, "Suresh", 48, 40000));
	
// print age>50 and Name only.
	
                     emp.stream()
	
	               .filter(e->e.getAge()>50)
	           
	               .forEach(x->System.out.println(x.age+" "+ x.getName()));
                     
                     
                     
     // for String sort we need to CompareTo()
     // for Integer sort we need to use  ternary with compare() method.
                  		
     // we need print only name , Age ..then we need to declare in 		
                     System.out.println('\n');
                     System.out.println("Sorted by Name"+'\n');
         emp.stream()
        // .filter(x->x.getAge()>10)
         .sorted((i1,i2)-> i1.getName().compareTo(i2.getName()))
        
           .forEach(x->System.out.println(x.getId()+ " "+x.getName()+"   :"+x.getAge()));
                  		  
          System.out.println( '\n');
           System.out.println("Sorted by Age"+'\n');
                  		  
                  		  
                emp.stream()
               .filter(x->x.getAge()>10)
               .sorted((i1,i2)->     (i1.getAge()>i2.getAge()?-1:(i1.getAge()<i2.getAge()?+1:0)                   ) )
               .forEach(x->System.out.println(x.getId()+ " "+x.getName()+"  Age   :"+x.getAge()));
                  			  
                     			                  
                System.out.println( '\n');
                System.out.println("print only Age"+'\n');
       
                emp.stream()
                .filter(x->x.getAge()>10)
                .map(x->x.getAge() )
                 
                .forEach(System.out::println);
                
 	 
 
	
	
}

}














