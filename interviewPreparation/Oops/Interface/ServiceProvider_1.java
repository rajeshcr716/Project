package Interface;
import java.lang.*;
import java.util.*;


interface interf1 {
	public void m1();
	public int m2();
	
}

class addBody implements interf1 {

	@Override
	public void m1() {
		System.out.println("m1 method with body");
		
	}

	@Override
	public int m2() {
		System.out.println("m2 method with body");
		return 10;
		
	}
	
}

public class ServiceProvider_1 {
public static void main(String[] args) {
	
	addBody s = new addBody();
	s.m1();
	
	System.out.println(s.m2());
	
}
}
