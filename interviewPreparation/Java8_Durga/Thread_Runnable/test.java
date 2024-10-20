package Thread_Runnable;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class student
{
	String name;
	int marks;
	String gender;
	public student(String name, int marks, String gender) {
		super();
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	 
	
}



public class test {
	public static void main(String[] args) {
		
		ArrayList<student> l = new ArrayList<student>();
		l.add(new student("abc",45,"Male"));
		l.add(new student("def",65,"Female"));
		l.add(new student("xyz",89,"Male"));
		l.add(new student("mno",46,"Female"));
		 
	Map<String,Double> ave =	l.stream()
		.collect(Collectors.groupingBy(student::getGender,
				Collectors.averagingInt(student::getMarks)));
		
	
	System.out.println(ave);
		
	}

}








