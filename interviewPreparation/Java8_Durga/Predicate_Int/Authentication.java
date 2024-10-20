package Predicate_Int;

import java.util.function.Predicate;
import java.util.*;

class user
{
	String username;
	String pwd;
	public user(String username, String pwd) {
		 
		this.username = username;
		this.pwd = pwd;
	}
	
	
}



public class Authentication {
public static void main(String[] args) {
	
	Predicate<user> p = s -> s.username.equals("Durga" )&& s.pwd.equals("java") ;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter User name: ");
	
	
	String username = sc.next();
	
	System.out.println("Enter password: ");
	String pwd = sc.next();
	
	user user1 = new user(username,pwd);
	
	 if(p.test(user1))
	 {
		 System.out.println("Validation Successful");
	 }
	 else
	 {
		 System.out.println("Validataion failed");
		 System.out.println("detailsa: "+user1.username +" "+user1.pwd);
	 }
	
	
	
}
}
