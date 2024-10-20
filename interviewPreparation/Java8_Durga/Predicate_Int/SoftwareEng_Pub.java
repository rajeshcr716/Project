package Predicate_Int;
import java.util.*;
import java.util.function.*;

class softwareEngineer{
	String name;
	int age;
	Boolean isHavingGf;
	public softwareEngineer(String name, int age, Boolean isHavingGf) {
		 
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}
	
	
}


public class SoftwareEng_Pub {
	public static void main(String[] args) {
		
		
		//softwareEngineer[] -->this part means type. String,Int,double.. and Object type
		
		softwareEngineer[] list = { 
				new softwareEngineer("alex",23,true),
				new softwareEngineer("laorn",21,false),
				new softwareEngineer("Arya",17,true),
		};
		
		Predicate<softwareEngineer> p = s -> s.age>18 && s.isHavingGf;
		
		for(softwareEngineer w: list)
		{
			if(p.test(w))
			{
				System.out.println("Allowed Candidate: "+w.name);
			}
		}
		
		
	}

}
