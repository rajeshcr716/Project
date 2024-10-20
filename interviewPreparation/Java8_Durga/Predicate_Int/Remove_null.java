package Predicate_Int;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Remove_null {
public static void main(String[] args) {
	
 
	String[] names={"Durga","",null,"Ravi","","Shiva",null};
	
	Predicate<String> p=s-> s != null && s.length()!=0;
	
	ArrayList<String> list=new ArrayList<String>();

	
	for(String s : names)
	 {
	 if(p.test(s))
	 {
	 list.add(s);
	 }
	 }
	 System.out.println("The List of valid Names:");
	 System.out.println(list);

	
}
}