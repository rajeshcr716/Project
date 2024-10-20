package ArrayList_with_Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee
{
	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		
		this.eno = eno;
		this.ename = ename;
		 
	}
	public String toString()
	{
		return eno + " : "+ ename;
	}
	
	
	
}



public class Employee_Object {
	 

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new  Employee(100, "MAHESH"));
		l.add(new  Employee(400, "AKKI"));
		l.add(new  Employee(200, "SUDEEP"));
		l.add(new  Employee(300, "SRK"));
		
	    Collections.sort(l, (e1,e2)-> (e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?+1:0); // Comparator interface -->Compare() method
	   // Collections.sort(l,(i1,i2)-> i1.ename.compareTo(i2.ename));               //Comparable Interface  -->CompareTo() method
	   
		
		 
		
	      //Collection.sort(l); is not applicable because this object type it contain multiple field or int,string,double..mixed values so not able to sort.
		
		//System.out.println(l);
		for(Employee w: l)
		{
			System.out.println(w.eno +" : "+ w.ename+'\n');
		}
		
	}

}
